import java.io.*;
import java.util.*;

public class Main_2217로프 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        //배열의 요소에 N - i를 곱한 후 최대값 갱신
        for(int i = 0; i < N; i++){
            arr[i] *= (N - i); //현재 요소에 (N - i) 곱함
            if(max < arr[i]) max = arr[i]; //최대값 갱신
        }

        System.out.println(max);
        br.close();
    }
}
