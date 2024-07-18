import java.util.*;
import java.io.*;

public class Main_1918후위표기식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] calc = br.readLine().toCharArray(); //입력된 수식
        Stack<Character> st = new Stack<>(); //연산자를 담을 스택
        StringBuilder sb = new StringBuilder(); //후위 표기법으로 변환

        for (int i = 0; i < calc.length; i++) { //후위 표기법으로 변환
            // 피연산자(알파벳)인 경우 바로 결과 문자열에 추가
            if (calc[i] >= 'A' && calc[i] <= 'Z') {
                sb.append(calc[i]);
            } else if (calc[i] == '(') { // '('인 경우 스택에 push
                st.push(calc[i]);
            } else if (calc[i] == ')') { // ')'인 경우 '('가 나올 때까지 스택에서 pop하여 결과 문자열에 추가
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                } if (!st.isEmpty()) st.pop(); // '('를 스택에서 제거
            } else { // 연산자인 경우
                // 스택의 top에 있는 연산자의 우선 순위가 더 크거나 같으면 pop하고 결과 문자열에 추가
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(calc[i])) {
                    sb.append(st.pop());
                }
                st.push(calc[i]); // 현재 연산자를 스택에 push
            }
        }

        while (!st.isEmpty()) { //비어있는 경우의 예외처리, 스택이 빌때까지 반복된다
            sb.append(st.pop()); //sb 문자열에 저장
        }
        System.out.println(sb);
    }

    //연산자 우선순위 부여
    public static int precedence(char st) {
        if (st == '*' || st == '/') return 2; //*또는 /일 경우 우선순위 2
        else if (st == '+' || st == '-') return 1; //+또는 -일 경우 우선순위 1
        else return 0; // 0 반환
    }
}