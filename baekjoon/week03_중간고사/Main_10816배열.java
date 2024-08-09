import java.io.*;
import java.util.*;

public class Main_10816배열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 카드의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 숫자 카드에 적힌 정수들 입력 및 정렬
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        // 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 숫자의 개수 M 입력
        int M = Integer.parseInt(br.readLine());

        // 구해야 할 숫자들 입력
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // 각 숫자에 대해 상근이가 가지고 있는 숫자 카드 개수 계산
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            // 이진 탐색을 이용해 lowerBound와 upperBound의 차이를 구함
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }

        // 결과 출력
        System.out.println(sb);
    }

    // lowerBound 구하는 메서드
    private static int lowerBound(int[] arr, int key) {
        int n = 0;
        int m = arr.length;

        while (n < m) {
            int mid = (n + m) / 2;

            if (key <= arr[mid]) {
                m = mid;
            } else {
                n = mid + 1;
            }
        }

        return n;
    }

    // upperBound 구하는 메서드
    private static int upperBound(int[] arr, int key) {
        int n = 0;
        int m = arr.length;

        while (n < m) {
            int mid = (n + m) / 2;

            if (key < arr[mid]) {
                m = mid;
            } else {
                n = mid + 1;
            }
        }

        return n;
    }
}
