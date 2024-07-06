import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 입력 받기
            String binaryString = br.readLine().trim();

            // 문자열 binaryString을 2진수로 해석한 후.
            //int형이 아닌 BigInteger형으로 형변환을 해주면서 10진수의 정수로 변환한다
            BigInteger decimalNumber = new BigInteger(binaryString, 2);

            // 10진수를 8진수로 변환
            //10진수의 정수로 변환된 수를 다시 문자열 형태의 8진수로 바꾼다
            String octalString = decimalNumber.toString(8);

            // 결과 출력
            System.out.println(octalString);

            br.close();
    }
}