import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제
        //1.다섯줄의 입력이 주어진다.
        //2.각 줄에는 1~15개의 글자들이 연속으로 주어진다.
        //3. 주어지는 글자는 영어 대문자 A~Z, 소문자 a~z, 숫자 0~9이다.
        //4. 세로로 읽은 순서대로 글자들을 출력한다.

        //풀이
        //1. 세로 5 가로 15줄을 입력받는다
        //2. 최대 길이를 계산한다.
        //3. 각 단어를 출력한다.
        //4. 값이 0인 경우 생략한다.

        //설명
        //1. 5x15의 2차원 배열을 선언한다.
        //2. 다섯개 중 가장 긴 길이를 계산한다. (반복 횟수)
        //3. 각 단어의 인덱스를 가져와 Stringbuilder에 추가한다
        //4. StrigBuilder에 저장된 문자열을 출력한다
        //5. 각 줄마다 문자열을 입력받고 최대 길이를 max변수에 저장한다.
        //6. 입력받은 문자열을 2차원 배열에 담는다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15]; //5X15
        int max = 0; //가장 긴 단어의 길이

        for (int i = 0; i <ch.length; i++){
            String str = br.readLine(); //한 줄을 읽어옴
            if(str.length() > max){
                max = str.length(); //가장 긴 단어의 길이 비교
            }

            //각 단어를 char 배열에 저장
            for (int j = 0; j < str.length(); j++){
                ch[i][j] = str.charAt(j); //[i][j] == 배열의 행과 열
            }
        }

        //세로로 읽어 stringbuilder에 저장
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++){ //열 반복
            for (int j = 0; j < 5; j++){ //행 반복
                if(ch[j][i] == '\0')continue; //0 생략
                sb.append(ch[j][i]); //세로로 읽은 문자를 stringbuilder에 추가
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}