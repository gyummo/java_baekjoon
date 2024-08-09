import java.io.*;
import java.util.*;

public class Main_19583compareTo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken(); //출근
        String b = st.nextToken(); //퇴근
        String Stream = st.nextToken(); //머튜브

        int ans = 0;
        HashSet<String> N = new HashSet<>(); //출근 체크
        HashSet<String> M = new HashSet<>(); //퇴근 체크
        String temp;

        while((temp=br.readLine())!=null) {
            if(a.compareTo(temp.split(" ")[0])>=0) { //공백을 기준으로 배열 생성
                N.add(temp.split(" ")[1]); //출근 시간 후 출첵을 하면 추가
            } else if(b.compareTo(temp.split(" ")[0])<=0 && Stream.compareTo(temp.split(" ")[0])>=0 ) {
                M.add(temp.split(" ")[1]); //퇴근 시간 후 출첵을 하면 추가
            }
        }

        for (String tmp : M) {
            if(N.contains(tmp)) {  //tmp에 N이 있는지 검사
                ans++;
            }
        }

        System.out.println(ans);
    }
}