import java.io.*;
import java.util.*;

public class Main_18115Deque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //두 번째 입력을 뒤집기
        StringTokenizer st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());

        //Deque로 정수 저장
        Deque<Integer> d = new LinkedList<>();

        //1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            //역순으로 입력된 값 중에서 다음 정수 호출
            int num = Integer.parseInt(st.nextToken());

            //num이 1일 때 현재 숫자를 덱의 맨 앞에 추가
            if (num == 1) {
                d.addFirst(i);
            //num이 2일 때, 덱의 맨 앞에서 숫자를 제거한 후 현재 숫자를 덱의 맨 앞에 추가
            } else if (num == 2) {
                int top = d.removeFirst(); //맨 앞 요소를 제거하고 저장
                d.addFirst(i); //현재 숫자를 맨 앞에 추가
                d.addFirst(top); //제거한 숫자를 맨 앞에 추가
            } else {
                d.addLast(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        //덱이 빌 때까지 모두 StringBuilder에 저장
        while (d.size() != 0) {
            sb.append(d.removeFirst() + " ");
        }

        System.out.println(sb);
    }
}
