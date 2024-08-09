import java.util.*;
import java.io.*;

public class Main_9375해쉬맵3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        //테스트케이스 입력받을 변수
        int N = Integer.parseInt(br.readLine().trim());

        //테스트케이스 만큼 반복
        for (int i = 1; i <= N; i++) {
            int M = Integer.parseInt(br.readLine().trim());

            //의상 종류 개수
            Map<String, Integer> map = new HashMap<>();

            //M개의 의상 정보
            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                st.nextToken();
                String type = st.nextToken(); //의상 종류

                //의상종류 map에 저장
                //의상종류 + 1,
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            //모든 종류의 의상
            int ans = 1;
            for (int count : map.values()) {
                //(의상 개수 + 1) 곱하기
                ans *= (count + 1);
            }

            result.append(ans - 1).append("\n");
        }

        System.out.println(result);
        br.close();
    }
}
