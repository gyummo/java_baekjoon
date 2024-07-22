import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력 처리
        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수
        int[] materials = new int[N]; // 재료들의 번호 배열

        // 두 번째 줄 입력 처리 (재료들의 고유 번호들)
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        // 재료 번호 배열 정렬
        Arrays.sort(materials);

        int count = 0; // 갑옷을 만들 수 있는 경우의 수
        int left = 0; // 왼쪽 포인터
        int right = N - 1; // 오른쪽 포인터

        // 투 포인터를 이용한 합 검사
        while (left < right) {
            int sum = materials[left] + materials[right];

            if (sum == M) {
                count++;
                left++;
                right--;
            } else if (sum < M) {
                left++;
            } else { // sum > M
                right--;
            }
        }

        System.out.println(count); // 결과 출력
    }
}
