import java.io.*;
import java.util.*;

public class Main_13305주유소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] A1 = new long[N - 1];
        long[] A2 = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < A1.length; i++){
            A1[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < A2.length; i++){
            A2[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = A2[0];

        for(int i = 0; i < A1.length; i++){
            if(A2[i] < min){
                min = A2[i];
            }
            sum += (min * A1[i]);
        }

        System.out.println(sum);
        br.close();
    }
}
