import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //문자열을 정수로 변환, 숫자의 개수
        int sum = 0; //합계
        String str = br.readLine(); //문자열로 숫자 입력

        for (int i = 0; i < N; i++){
            sum += str.charAt(i) - 48; //문자를 정수로 변환
        }

        System.out.println(sum);
        br.close();
    }
}