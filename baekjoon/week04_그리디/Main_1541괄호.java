import java.util.*;
import java.io.*;

public class Main_1541괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //sum 변수 초기화
        //Integer.MAX_VALUE로 첫번째 덧셈이 sum에 직접 저장
        int sum = Integer.MAX_VALUE;
        StringTokenizer sb = new StringTokenizer(br.readLine(), "-");

        //-로 구분된 토큰
        while(sb.hasMoreTokens()) {
            // +로 구분된 수를 더함
            int tmp = 0;
            StringTokenizer st = new StringTokenizer(sb.nextToken(), "+");

            //+로 구분된 토큰을 tmp에 더함
            while (st.hasMoreTokens()) {
                tmp += Integer.parseInt(st.nextToken());
            }

            //-로 구분된 토큰의 합을 sum에 저장
            //-로 구분된 토큰의 합 제거
            if (sum == Integer.MAX_VALUE) {
                //Integer.MAX_VALUE 일때
                //첫번째 -로 구분된 토큰의 합을 저장
                sum = tmp;
            } else {
                //-로 구분된 토큰의 합을 sum에서 제거
                sum -= tmp;
            }
        }

        System.out.println(sum);
        br.close();
    }
}
