import java.io.*;
import java.util.*;

public class Main_5397키로거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수를 입력 받음

        for(int i = 0; i < T; i++){
            String str = br.readLine(); //테스트 케이스의 문자열 입력받음

            String pwd = key(str); //key 함수 호출
            System.out.println(pwd);
        }
    }

    public static String key(String str){
        Stack<Character> stack = new Stack<>();
        Stack<Character> tmp = new Stack<>();

        //입력된 문자열을 순회하며 시뮬레이션
        for(int j = 0; j < str.length(); j++){
            switch(str.charAt(j)){
                case '<':
                    if(!stack.isEmpty()) tmp.push(stack.pop()); // <일 경우 tmp로 이동
                    break;
                case '>':
                    if(!tmp.isEmpty()) stack.push(tmp.pop()); // >일 경우 stack으로 가져옴
                    break;
                case '-':
                    if(!stack.isEmpty()) stack.pop(); // -일 경우 마지막 값 삭제
                    break;
                default:
                    stack.push(str.charAt(j)); // 그 외일 경우 해당 문자를 stack에 추가
                    break;
            }
        }

        //tmp에 남아있는 문자들을 모두 stack으로 이동
        while(!tmp.isEmpty()){
            stack.push(tmp.pop());
        }

        //stack 안에 있는 문자들을 문자열로 만듬
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString(); //비밀번호 문자열
    }
}