import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제
        //1.첫째 줄에 파일의 개수 N이 주어진다
        //2.둘째 줄에는 패턴이 주어진다. 패턴은 알파벳 소문자와 별표 한 개로 이루어져 있다.
        //3.다음 N개 줄에는 파일 이름이 주어진다. 파일 이름은 알파벳 소문자로만 이루어져 있다.

        //풀이
        //1. 파일의 개수를 입력받는다.
        //2. 파일의 끝에 위치한 알파벳을 a, d와 비교한다.
        //3. 파일 이름이 일치하면 DA, 일치하지 않으면 NE를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 파일 개수 입력
        int tc = Integer.parseInt(br.readLine().trim());

        // 패턴 입력
        String[] pattern = br.readLine().trim().split("\\*");

        // 정규 표현식 패턴 생성
        String regex = "^" + Pattern.quote(pattern[0]) + ".*" + Pattern.quote(pattern[1]) + "$";
        Pattern p = Pattern.compile(regex);

        // 각 파일 이름에 대해 패턴과 비교
        for (int i = 0; i < tc; i++) {
            String word = br.readLine().trim();
            Matcher m = p.matcher(word);
            if (m.find()) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

        br.close();
    }
}
