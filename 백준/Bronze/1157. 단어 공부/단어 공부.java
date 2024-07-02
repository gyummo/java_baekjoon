import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제
        //1.알파벳 대소문자로 된 단어가 주어진다
        //2.이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아낸다
        //3.가장 많이 사용된 알파벳을 대문자로 출력한다

        //풀이
        //1. 전부 대문자로 바꾼다
        //2. 각 알파벳의 빈도수를 구한다
        //3. 가장 많이 나타나는 알파벳을 찾는다
        //4. 이 값을 가진 알파벳의 개수를 구한다.
        //5. 가장 많이 나타나는 알파벳이 한 개일 경우와, 그렇지 않을 경우를 고려한다.

        //설명
        //1. uppercase를 이용하여 전부 대문자로 바꾼다
        //2. 배열을 순회하며 소문자일 경우 result의 인덱스 값을 증가시킨다.
        //3. max 변수에 최댓값을 할당하고 이 값을 개진 알파벳의 개수를 cout 변수에 저장한다.
        //4. 문자열로 변환하여 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        String input = br.readLine().toUpperCase();

        // 알파벳 빈도수를 저장할 배열
        int[] frequency = new int[26]; // 알파벳 'A'부터 'Z'까지 인덱스 0부터 25까지 사용

        // 입력된 문자열의 알파벳 빈도수 계산
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('A' <= ch && ch <= 'Z') { // 알파벳인 경우만 처리
                frequency[ch - 'A']++;
            }
        }

        // 가장 많이 사용된 알파벳 찾기
        int maxFrequency = 0;
        char answer = '?';

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                answer = (char) ('A' + i); // 해당 인덱스에 해당하는 알파벳 구하기
            } else if (frequency[i] == maxFrequency) {
                answer = '?'; // 최댓값이 여러개인 경우
            }
        }

        // 결과 출력
        System.out.println(answer);
        br.close();
    }
}