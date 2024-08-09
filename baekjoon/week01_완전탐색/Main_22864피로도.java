import java.util.*;
import java.io.*;

public class Main_22864피로도 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int M = Integer.parseInt(inputs[3]);

        // 초기 상태 설정
        int currentFatigue = 0;
        int totalWorkDone = 0;
        int hoursInADay = 24;

        for (int i = 0; i < hoursInADay; i++) {
            if (currentFatigue + A <= M) {
                currentFatigue += A;
                totalWorkDone += B;
            } else {
                currentFatigue -= C;
                if (currentFatigue < 0) {
                    currentFatigue = 0;
                }
            }
        }

        // 결과 출력
        System.out.println(totalWorkDone);
    }
}
