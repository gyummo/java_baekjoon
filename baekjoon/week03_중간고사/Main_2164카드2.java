import java.util.*;
import java.io.*;

public class Main_2164카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        //1부터 N까지 queue에 저장
        for(int i = 1; i <= N; i++){
            q.offer(i);
        }

        //한 명만 남을때까지 반복
        while(q.size() > 1){
            //맨 앞에 있는 사람 제거
            q.poll();
            //그 다음 사람을 맨 뒤로 보냄
            q.offer(q.poll());
        }

        System.out.println(q.poll());
        br.close();
    }
}
