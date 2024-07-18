import java.util.*;
import java.io.*;

public class Main_18258큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine()); //연산 입력
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int Q = 0; //마지막으로 push된 값 저장
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()); //공백을 추가하여 나열
            switch(st.nextToken()){
                case "push":
                    int A = Integer.parseInt(st.nextToken()); //push
                    queue.add(A); //queue에 값 추가
                    Q = A;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n"); //비어있을 경우 -1 출력
                    } else {
                        sb.append(queue.poll()).append("\n"); //값을 꺼내 출력
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n"); //크기 출력
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1).append("\n"); //비어있을 경우 1 출력
                    } else {
                        sb.append(0).append("\n"); //비어있지 않으면 0 출력
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n"); //비어있으면 -1 출력
                    } else {
                        sb.append(queue.peek()).append("\n"); //맨 앞의 값 출력
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n"); //비어있으면 -1 출력
                    } else {
                        sb.append(queue.peekLast()).append("\n"); //맨 뒤 값 출력
                    }
                    break;
                default: break;
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}
