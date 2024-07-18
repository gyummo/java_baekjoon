import java.util.*;
import java.io.*;

public class Main_1935후위표기식2 {
    public static void main(String[] args) throws IOException, IllegalArgumentException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 변수의 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 후위 표기식 입력
        String exp = br.readLine().trim();

        // 변수들의 값을 입력받을 배열
        int[] v = new int[n];

        // 각 변수에 대응하는 값을 입력
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(br.readLine().trim());
        }

        // 스택 생성 (계산을 위한 스택)
        Stack<Double> st = new Stack<>();

        // 후위 표기식을 계산
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isAlphabetic(ch)) { // 피연산자인 경우 (A-Z 사이의 문자)
                double operandValue = v[ch - 'A'];
                st.push(operandValue);
            } else { // 연산자인 경우
                double operand2 = st.pop(); // 두 번째 피연산자 꺼내기
                double operand1 = st.pop(); // 첫 번째 피연산자 꺼내기
                double result = 0.0;

                // 연산 수행
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                }

                // 연산 결과를 스택에 push
                st.push(result);
            }
        }

        // 스택에서 최종 결과 꺼내기
        double finalResult = st.pop();

        // 결과를 소수점 둘째 자리까지 출력
        System.out.printf("%.2f\n", finalResult);

        // BufferedReader 닫기
        br.close();
    }
}