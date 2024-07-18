import java.io.*;
import java.util.*;

public class Main_1158요세푸스 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++){
            q.offer(i); //1 ~ N의 숫자를 q에 저장
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        //queue에 한 명이 남을때까지 반복
        while (q.size() > 1){
            //K번째의 사람을 제거하기 위해 K-1 번째까지의 사람을 q의 맨 뒤로 보낸다
            for(int i = 0; i < K - 1; i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");

        String result = sb.toString();
        System.out.println(result);

       br.close();
    }
}
