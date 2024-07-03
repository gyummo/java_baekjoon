import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //문제
        //1. 문자열 S가 주어진다.
        //2. 문자열 입력 방식에는 태그와 단어가 있다.
        //3. 입력된 문자열 S를 뒤집는다.

        //예제 입력
        //baekjoon online judge
        //<open>tag<close>

        //예제 출력
        //noojkeab enilno egduj
        //<open>gat<close>

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim(); // 입력 문자열을 받고 양 끝의 공백을 제거

        StringBuilder result = new StringBuilder();
        StringBuilder wordBuilder = new StringBuilder();

        boolean inTag = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '<') {
                // 태그 시작
                inTag = true;
                // 이미 단어가 쌓인 경우 출력하고 초기화
                if (wordBuilder.length() > 0) {
                    result.append(reverseWord(wordBuilder.toString()));
                    wordBuilder.setLength(0); // StringBuilder 초기화
                }

                result.append('<');
            } else if (ch == '>') {
                // 태그 끝
                inTag = false;
                result.append('>');
            } else if (inTag) {
                // 태그 내부의 경우 그대로 추가
                result.append(ch);
            } else {
                // 단어 처리
                if (ch == ' ') {
                    // 공백을 만나면 이전 단어 처리
                    result.append(reverseWord(wordBuilder.toString()));
                    result.append(' ');
                    wordBuilder.setLength(0); // StringBuilder 초기화
                } else {
                    // 단어 누적
                    wordBuilder.append(ch);
                }
            }
        }

        // 마지막에 남은 단어 처리
        if (wordBuilder.length() > 0) {
            result.append(reverseWord(wordBuilder.toString()));
        }

        System.out.println(result.toString());
    }

    // 단어를 뒤집는 함수
    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}