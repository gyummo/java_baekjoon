import java.util.*;
import java.io.*;

public class Main_1620포켓몬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //포켓몬의 개수
        int M = Integer.parseInt(st.nextToken()); //문제의 개수

        StringBuilder sb = new StringBuilder();
        //조건에 따라 다르게 쓰일 두개의 HashMap
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>(); //포켓몬 번호순 이름저장
        HashMap<String, Integer> hash2 = new HashMap<String, Integer>(); //포켓몬 이름순 번호저장


        for(int i = 1; i <= N; i++) {
            String S = br.readLine(); //N만큼의 포켓몬 이름
            hash1.put(i, S); //포켓몬 번호에 대응하는 이름
            hash2.put(S, i); //포켓몬 이름에 대앙하는 번호
        }

        for(int i = 0; i < M; i++) { //M개의 문제
            String S = br.readLine();
            if(49 <= S.charAt(0) && S.charAt(0) <= 57) {
                sb.append(hash1.get(Integer.parseInt(S))).append("\n"); //번호에 해당하는 포켓몬
            }else {
                sb.append(hash2.get(S)).append("\n"); //이름에 해당하는 포켓몬 번호
            }
        }
        System.out.println(sb);
    }
}
