import java.io.*;
import java.util.*;

public class Main_19532수학 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 입력된 문자열을 읽어오기
        String[] input = reader.readLine().split(" ");

        // 문자열을 정수로 변환
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);

        // 행렬식 계산
        int determinant = a * e - b * d;

        // x와 y를 계산
        int xNumerator = c * e - b * f;
        int yNumerator = a * f - c * d;

        // x와 y를 정수로 계산
        int x = xNumerator / determinant;
        int y = yNumerator / determinant;

        // 결과 출력
        System.out.println(x + " " + y);
    }
}