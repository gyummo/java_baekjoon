import java.util.*;
import java.io.*;

public class Main_11047동전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //동전의 종류 개수
        int n = Integer.parseInt(st.nextToken());
        //목표 금액
        int m = Integer.parseInt(st.nextToken());

        //동전의 가치
        int[] five = new int[n];

        //n개의 동전의 가치를 입력받아 배열에 저장
        for(int i = 0; i < n; i++){
            five[i] = Integer.parseInt(br.readLine());
        }

        //동전이 개수
        int result = 0;
        //동전의 가치 배열을 내림차순로 정렬
        for(int i = n - 1; i >= 0; i--){
            //동전의 가치가 m보다 작거나 같다면
           if(five[i] <= m){
               //현재 동전으로 만들 수 있는 최대 개수만큼 result에 추가
               result += (m / five[i]);
               //남은 금액을 현재 동전의 가치로 나눈 나머지로 갱신
               m = m % five[i];
           }
        }

        System.out.println(result);
        br.close();
    }
}
