import java.io.*;
import java.util.*;

public class Main_14501퇴사 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine().trim());

            int[] Ti = new int[N];
            int[] Pi = new int[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine().trim());
                Ti[i] = Integer.parseInt(st.nextToken());
                Pi[i] = Integer.parseInt(st.nextToken());
            }

            int[] dp = new int[N + 1];

            for (int i = 0; i < N; i++) {
                if (i + Ti[i] <= N) {
                    dp[i + Ti[i]] = Math.max(dp[i + Ti[i]], dp[i] + Pi[i]);
                }
                dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            }

            System.out.println(dp[N]);
        }
    }