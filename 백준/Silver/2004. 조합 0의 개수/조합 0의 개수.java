import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long count2 = countFactors(n, 2) - countFactors(m, 2) - countFactors(n - m, 2);
        long count5 = countFactors(n, 5) - countFactors(m, 5) - countFactors(n - m, 5);

        System.out.println(Math.min(count2, count5));
    }

    // n!에서 num의 배수의 개수를 구하는 함수
    private static long countFactors(int n, int num) {
        long count = 0;
        long factor = num;

        while (factor <= n) {
            count += n / factor;
            if (factor > Long.MAX_VALUE / num) break; // 오버플로우 방지
            factor *= num;
        }

        return count;
    }
}