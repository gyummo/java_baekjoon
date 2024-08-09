import java.io.*;
import java.util.*;

public class Main_18312시각 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        // K를 문자로 변환
        char KChar = (char) (K + '0');

        int count = 0;

        // 모든 시각을 탐색
        for (int hour = 0; hour <= N; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    String time = String.format("%02d%02d%02d", hour, minute, second);
                    if (time.indexOf(KChar) != -1) {
                        count++;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
