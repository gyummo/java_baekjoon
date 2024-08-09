import java.util.*;
import java.io.*;

public class Main_17626Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        int[] squares = new int[(int) Math.sqrt(n) + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            squares[i] = i * i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < squares.length; j++) {
                if (squares[j] > i) break;
                dp[i] = Math.min(dp[i], dp[i - squares[j]] + 1);
            }
        }

        System.out.println(dp[n]);
        br.readLine();
    }
}
