import java.util.*;
import java.io.*;

public class Main_1406에디터 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); //초기 문자열
        int M = Integer.parseInt(br.readLine()); //명령어 개수

        Stack<Character> leftSt = new Stack<>(); //왼쪽 스택 (커서 기준 왼쪽 문자열)
        Stack<Character> rightSt = new Stack<>(); //오른쪽 스택 (커서 기준 오른쪽 문자열)

        for(char c : str.toCharArray()) {
            leftSt.push(c); //문자열을 문자 단위로 왼쪽 스택에 넣음
        }

        for(int i = 0; i < M; i++) {
            String command = br.readLine(); //명령어 한 줄을 읽어온다
            char c = command.charAt(0); //명령어의 첫 번째 문자를 가져온다

            switch(c) {
                case 'L': //왼쪽으로 커서 이동
                    if(!leftSt.isEmpty())
                        rightSt.push(leftSt.pop()); //왼쪽에서 오른쪽으로 이동
                    break;
                case 'D': //오른쪽으로 커서 이동
                    if(!rightSt.isEmpty())
                        leftSt.push(rightSt.pop()); //오른쪽에서 왼쪽으로 이동
                    break;
                case 'B': //커서 왼쪽 문자 삭제
                    if(!leftSt.isEmpty()) {
                        leftSt.pop(); //왼쪽 스택에서 문자 삭제
                    }
                    break;
                case 'P': //문자 추가
                    char t = command.charAt(2); //명령어에서 추가할 문자 가져오기
                    leftSt.push(t); //왼쪽 스택에 추가
                    break;
                default:
                    break;
            }
        }

        while(!leftSt.isEmpty()) {
            rightSt.push(leftSt.pop()); //남아있는 모든 문자를 오른쪽 스택으로 옮긴다
        }

        StringBuilder result = new StringBuilder();
        while(!rightSt.isEmpty()) {
            result.append(rightSt.pop()); //오른쪽 스택에서 문자를 꺼내어 결과에 추가
        }
        System.out.println(result.toString());
    }
}
