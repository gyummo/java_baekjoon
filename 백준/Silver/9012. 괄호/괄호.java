import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //틀린경우
        //( 혹은 )만 있을 경우
        //(( 혹은 ))만 있는 경우
        //( + )) (( + )
        // = 여는 괄호와 닫는 괄호는 한쌍

        //풀이
        //스택에 (삽입
        //( 가 비어있는지 확인
        //비어있으면 ) 삽입 아니면 반환
        //비어있으면 YES, 아니면 NO
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<Character>();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else {
                    if (stack.empty()) {
                        stack.push(s.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}