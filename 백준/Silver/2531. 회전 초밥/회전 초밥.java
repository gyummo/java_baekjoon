import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 회전 초밥 벨트에 놓인 접시의 수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        int[] belt = new int[N]; // 초밥의 종류를 저장할 배열
        for (int i = 0; i < N; i++) {
            belt[i] = Integer.parseInt(br.readLine());
        }

        int maxCount = 0; // 최대 종류 수 초기화

        // 모든 k개의 연속적인 접시를 순회하며 다양한 종류의 초밥을 센다
        for (int start = 0; start < N; start++) {
            boolean[] visited = new boolean[d + 1]; // 초밥의 종류를 체크할 배열
            int count = 0; // 현재 찾은 연속된 k개 초밥에서 먹을 수 있는 종류의 수

            // k개의 초밥을 세팅
            for (int i = 0; i < k; i++) {
                int idx = (start + i) % N; // 벨트가 회전하기 때문에 인덱스 계산
                if (!visited[belt[idx]]) {
                    visited[belt[idx]] = true;
                    count++;
                }
            }

            // 쿠폰 초밥 추가 고려
            if (!visited[c]) {
                count++;
            }

            // 최대 종류 수 업데이트
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount); // 결과 출력
    }
}