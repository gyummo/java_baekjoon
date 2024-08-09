import java.io.*;

public class Main_10870피보나치 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int result = fib(N);

        System.out.println(result);

    }

    public static int fib(int N){
        if (N == 0){
            return 0;
        } else if (N == 1){
            return 1;
        }

        int a = 0;
        int b = 1;
        int f = 0;

        for (int i = 2; i <= N; i++){
            f = a + b;
            a = b;
            b = f;
        }

        return f;
    }
}
