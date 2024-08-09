import java.util.*;
import java.io.*;

public class Main_1758알바생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //배열을 내림차순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        //계산결과를 저장
        long sum = 0;
        //인덱스 값
        int z = 0;

        for (int i = 0; i < n; i++) {
            //z를 뺀 값이 0보다 큰 경우에 sum에 추가
            if (arr[i] - z > 0) {
                sum += arr[i] - (z++);
            } else {
                break;
            }
        }

        sb.append(sum);
        System.out.print(sb.toString());

        br.close();
    }
}
