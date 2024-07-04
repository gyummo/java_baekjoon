import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    //문제
    //M이상 N 이하의 소수를 모두 출력하는 프로그램을 작성하시오

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]); // M 이상
        int n = Integer.parseInt(input[1]); // N 이하

        // 입력 범위 체크
        if (m < 1 || n > 1_000_000 || m > n) {
            return;
        }

        // M 이상 N 이하의 소수 구하기
        ArrayList<Integer> primes = countPrimes(m, n);

        // 출력
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    // 에라토스테네스의 체 알고리즘을 사용하여 M 이상 N 이하의 소수를 찾는 메서드
    private static ArrayList<Integer> countPrimes(int m, int n) {
        boolean[] isPrime = new boolean[n + 1]; // 0부터 n까지의 소수 여부를 저장할 배열
        ArrayList<Integer> primes = new ArrayList<>(); // 소수를 저장할 리스트

        // 초기화: 2부터 n까지 모두 소수로 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘 적용
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // p가 소수인 경우, p의 배수들을 소수가 아니라고 표시
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // m 이상 n 이하의 소수를 리스트에 추가
        for (int i = Math.max(2, m); i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}