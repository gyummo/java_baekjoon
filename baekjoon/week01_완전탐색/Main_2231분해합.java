import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231분해합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int small = 0;

        for (int i = Math.max(0, N - 54); i < N; i++){
            if(i + sum(i) == N){
                small = i;
                break;
            }
        }

        System.out.println(small);
    }

    public static int sum(int num){
        int count = 0;
        while(num > 0){
            count += num % 10;
            num /= 10;
        }

        return count;
    }
}
