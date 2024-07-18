import java.io.*;
import java.util.*;

public class Main_1874스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        //수열 지정
        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];

        for(int i = 0; i < n; i++){
            sequence[i] = Integer.parseInt(br.readLine());
        }

        int current = 1; //수열에 들어갈 숫자

        for (int num : sequence){
            while (current <= num){
                st.push(current); //숫자를 스택에 push한다
                result.append("+\n"); //push 연산
                current++; //current 값 증가
            }

            //스택의 top이 수열에서 처리하는 숫자와 같은지 확인
            if(st.peek() == num){
                st.pop(); //수열에서 처리해야 할 숫자와 top이 일치하면 pop
                result.append("-\n");
            } else {
                System.out.println("NO"); //일치하지 않을 경우
                return;
            }
        }

        //수열 출력
        System.out.println(result.toString());
        br.close();
    }
}