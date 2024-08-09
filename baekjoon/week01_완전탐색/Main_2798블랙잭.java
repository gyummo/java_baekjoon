import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2798블랙잭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] card = br.readLine().split(" ");
        int[] cards = new int[N];

        for(int i = 0; i < N; i++){
            cards[i] = Integer.parseInt(card[i]);
        }

        int sum = 0;

        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    int count = cards[i] + cards[j] + cards[k];
                    if(count <= M && count > sum){
                        sum = count;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
