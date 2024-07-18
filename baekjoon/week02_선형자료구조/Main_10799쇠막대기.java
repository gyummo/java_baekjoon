import java.util.*;
import java.io.*;

public class Main_10799쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st = new Stack<>();

        String test = br.readLine();

        int result = 0;
        //문자열 크기
        for(int i = 0; i < test.length(); i++){
            char c = test.charAt(i);

            //문자열 중 열린괄호일 경우
            if(c == '('){
                //( 추가
                st.push(c);
            } else if ( c == ')'){
                st.pop();

                // empty가 아니거나 바로 이전 문자가 '('일 경우 레이저
                if (i > 0 && test.charAt(i - 1) == '(') {
                    result += st.size(); // 현재 스택의 크기만큼 레이저로 잘린 쇠막대기 추가
                } else {
                    result++; // 현재 닫힌 괄호는 쇠막대기의 끝을 나타냄
                }
            }
        }

        System.out.println(result);
        br.close();
    }
}
