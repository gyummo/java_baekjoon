import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //문제
    //1. 변수명을 입력받는다. 영어 알파벳과 _로만 이루어져 있다.
    //입력으로 주어진 변수명이 JAVA형식이면 C++ 형식으로 출력하고
    //C++형식이라면 java 형식으로 출력한다.
    //둘 다 아니라면 Error을 출력한다

    //풀이
    //1. 형식이 틀리면 error을 반환하고
    //2. 형식이 맞으면 java, cpp, 단어형 검사 메소드로 보낸다

    //- 틀린 형식
    // 1. 대문자와 _가 문자열 내에 같이 있는가
    // 2. 문자 처음에 _나 대문자가 있는가
    // 3. _가 두 개 이상 연속으로 있는가

    //-맞는 형식

    // 1. java 형식 (대문자가 있음)
    //isGptStupid -> is_gpt_stupid
    //cpp형으로 변경한다.

    // 2. cpp형식 (_가 있음)
    //is_right -> isRight
    // java형으로 변경한다

    // 3. 단어형
    // 문자열 그대로 반환한다.

    //예외처리를 먼저 하고 시작
    // 형식 검사 함수
    // -> false / true
    public static boolean isValidFormat(String str) {
        // 길이가 100을 넘는 경우 false 반환
        if (str.length() > 100) {
            return false;
        }

        //정규식 이용
        //1. 대문자와 '_'가 문자열 내에 같이 있는가
        //2. 문자 처음에 '_'나 대문자가 있는가
        //3. 문자 끝에 _가 있는가
        //4. '_' 가 두개 이상 문자 내에 있는가
        //반환된 값을 !로 부정하여 false 반환
        return !(str.matches(".*[A-Z].*") && str.matches(".*_.*") ||
                str.matches("^[_A-Z].*") ||
                str.matches(".*__+.*") ||
                str.matches(".*_$"));
    }

    // 형식 변환 함수
    public static String convertIdentifier(String str) {
        // false일 경우 error 출력
        if (!isValidFormat(str)) {
            return "Error!";
        }

        StringBuilder result = new StringBuilder();

        boolean toUpper = false;
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                // Case 1: c가 대문자인 경우
                if (i > 0 && !toUpper) {
                    // 앞 문자가 소문자일 경우에만 '_' 추가
                    result.append('_');
                }
                // c를 소문자로 변경하여 추가
                result.append(Character.toLowerCase(c));
            } else if (c == '_') {
                // Case 2: '_'인 경우
                toUpper = true;
            } else {
                // Case 3: 소문자인 경우
                result.append(c);
                toUpper = false;
            }

            if (toUpper && i + 1 < str.length()) {
                // '_' 뒤의 문자를 대문자로 변환하여 추가
                result.append(Character.toUpperCase(str.charAt(i + 1)));
                i++; // '_' 다음 문자를 건너뛰기
                toUpper = false; // 대문자 변환 상태 해제
            }

            i++; // 다음 문자로 이동
        }

        return result.toString();
    }

    //문자열 입력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력
        String input = br.readLine().trim();

        // 변환 후 출력
        String converted = convertIdentifier(input);
        System.out.println(converted);

        br.close();
    }
}