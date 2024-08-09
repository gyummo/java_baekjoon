import java.io.*;
import java.util.Stack;

public class Main_10773스택2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        int K = Integer.parseInt(br.readLine()); // 정수 K
        Stack<Integer> stack = new Stack<>(); // 정수를 저장할 스택

        // K개의 정수 처리
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine()); // 입력된 정수 읽기

            if (num == 0) {
                if (!stack.isEmpty()) {
                    stack.pop(); // 스택에서 가장 최근에 쓴 수를 지우기
                }
            } else {
                stack.push(num); // 스택에 정수 추가
            }
        }

        // 스택에 남아 있는 수들의 합 계산
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop(); // 스택에서 수를 꺼내면서 합산
        }

        // 결과 출력
        System.out.println(sum);

        br.close();
    }
}