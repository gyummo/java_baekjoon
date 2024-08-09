import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_15721번데기 {

    static int A, B, N;
    static int repeat = 2;
    static int zero, one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine().trim());
        B = Integer.parseInt(br.readLine().trim());
        N = Integer.parseInt(br.readLine().trim());

        int result = solve();
        System.out.println(result);
    }

    public static int solve() {
        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    zero++;
                    if (zero == B && N == 0) return (zero + one - 1) % A;
                }
                else {
                    one++;
                    if (one == B && N == 1) return (zero + one - 1) % A;
                }
            }

            for (int i = 0; i < repeat; i++) {
                zero++;
                if (zero == B && N == 0) return (zero + one - 1) % A;
            }

            for (int i = 0; i < repeat; i++) {
                one++;
                if (one == B && N == 1) return (zero + one - 1) % A;
            }
            repeat++;
        }
    }
}

