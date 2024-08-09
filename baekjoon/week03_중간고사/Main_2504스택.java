import java.io.*;
import java.util.*;

public class Main_2504스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim(); // 괄호열 입력 받기

        Stack<Character> stack = new Stack<>(); // 괄호를 저장할 스택
        int answer = 0; // 괄호열의 값 저장할 변수
        int tmp = 1; // 현재 괄호열의 값을 저장할 변수

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(ch); // '(' 괄호 스택에 저장
                tmp *= 2; // '(' 괄호의 값은 2
            } else if (ch == '[') {
                stack.push(ch); // '[' 괄호 스택에 저장
                tmp *= 3; // '[' 괄호의 값은 3
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') { // 올바르지 않은 괄호열인 경우
                    answer = 0;
                    break;
                }
                if (i > 0 && input.charAt(i - 1) == '(') { // '()' 괄호열의 값 처리
                    answer += tmp;
                }
                stack.pop(); // '(' 괄호 처리
                tmp /= 2;
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') { // 올바르지 않은 괄호열인 경우
                    answer = 0;
                    break;
                }
                if (i > 0 && input.charAt(i - 1) == '[') { // '[]' 괄호열의 값 처리
                    answer += tmp;
                }
                stack.pop(); // '[' 괄호 처리
                tmp /= 3;
            }
        }

        if (!stack.isEmpty()) { // 스택에 남아있는 괄호가 있는 경우
            answer = 0;
        }

        System.out.println(answer); // 결과 출력

        br.close();
    }
}