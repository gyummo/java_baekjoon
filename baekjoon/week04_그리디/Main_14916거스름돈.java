import java.util.*;
import java.io.*;

public class Main_14916거스름돈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //금액 입력
        int N = Integer.parseInt(st.nextToken());

        //동전의 개수
        int count = 0;

        //금액 N이 0보다 큰 경우
        while (N > 0){
            //N이 5로 나눠떨어지면
            if (N % 5 == 0){
                //N을 5로 나눈 몫만큼 동전을 추가
                count += N / 5;
                break;
            }
            //N이 5로 나눠떨어지지 않으면 2를 차감하고 동전 개수 증가
            N -= 2;
            count++;
        }

        //금액 N이 0보다 작으면 5와 2로 정확히 나눠지지 않는 경우이므로 -` 출력
        if (N < 0){
            System.out.println(-1);
        } else {
            System.out.println(count);
        }

        br.close();
    }
}
