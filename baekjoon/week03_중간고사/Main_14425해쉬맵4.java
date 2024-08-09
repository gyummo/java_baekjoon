import java.io.*;
import java.util.*;

public class Main_14425해쉬맵4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>(); //문자열과 빈도수 저장

        //n개의 문자열을 입력받아 HashMap에 저장
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0); //각 문자열을 key로 하고 초기값 0을 가지는 정수
        }

        int count = 0;

        //m개의 문자열을 입력받아 Hashmap에 포함된 문자열인지 확인하고 count 증가
        for (int i = 0; i < m; i++) {
            if (map.containsKey(br.readLine())) count++;
        }

        System.out.print(count);
    }
}

