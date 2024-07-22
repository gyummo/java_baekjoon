import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int max = 0; // 최대 합을 저장할 변수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 온도를 측정한 전체 날짜의 수
        int K = Integer.parseInt(st.nextToken()); // 합을 구하기 위한 연속적인 날짜의 수
        int[] tmp = new int[N]; // 온도를 저장할 배열

        // 온도 입력 받기
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        // 처음 K일간의 부분 합 계산
        for (int i = 0; i < K; i++) {
            max += tmp[i];
        }

        int temp = max; // 구간 온도의 합을 임시 변수에 저장

        // K일씩 옮겨가면서 최대 부분 합 찾기
        for (int i = K; i < N; i++) {
            temp = temp - tmp[i - K] + tmp[i];
            max = Math.max(max, temp);
        }

        System.out.println(max); // 최대 합 출력
    }
}