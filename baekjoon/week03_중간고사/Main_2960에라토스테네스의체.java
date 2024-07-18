import java.io.*;
import java.util.*;

public class Main_2960에라토스테네스의체 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 입력값 N
        int K = Integer.parseInt(st.nextToken()); // K번째 지우는 수

        int count = 0; // 현재까지 지운 수의 개수
        int result = 0; // K번째 지운 수

        boolean[] isPrime = new boolean[N + 1]; // 소수 여부를 저장할 배열

        // 초기화: 모든 수를 소수로 초기화
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘 수행
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) { // i가 소수인 경우
                for (int j = i; j <= N; j += i) { // i의 배수들을 모두 소수가 아닌 것으로 처리
                    if (isPrime[j]) {
                        isPrime[j] = false;
                        count++;
                        if (count == K) {
                            result = j;
                            break;
                        }
                    }
                }
            }
            if (count == K) {
                break;
            }
        }

        System.out.println(result); // 결과 출력

        br.close();
    }
}