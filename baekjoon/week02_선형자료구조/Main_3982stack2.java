import java.util.*;
import java.io.*;

public class Main_3982stack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //개수 입력
        int T = Integer.parseInt(br.readLine());

        int result = 0;

        //입력된 문자열 개수만큼 반복
        for (int i = 0; i < T; i++) {
            Stack<Character> st = new Stack<Character>();
            //문자열 입력
            String A = br.readLine();

            for (int j = 0; j < A.length(); j++) {
                //문자열을 하나씩 쪼갬
                char val = A.charAt(j);
                //스택이 비어있으면 현재 문자열을 넣음
                if (st.empty()) {
                    st.push(val);
                } else {
                    //스택이 비어있지 않으면 스택의 맨 위와 현재 문자 비교
                    if (st.peek() == val) {
                        //맨 위 문자와 현재 문자가 같으면 스택에서 제거
                        st.pop();
                    } else {
                        //맨 위 문자와 현재 문자가 다르면 현재 문자 삽입
                        st.push(val);
                    }
                }
            }
            if (st.empty()) {
                result++;
            }
        }
        System.out.println(result);

    }
}