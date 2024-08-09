import java.io.*;
import java.util.*;

public class Main_1343폴리오미노 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //입력 문자를 char로 배열로 변환
        char[] map = st.nextToken().toCharArray();

        //연속한 4개의 X == A
        for (int i = 0; i <= map.length - 4; i++) {
            //현재 인덱스부터 다음 세 개의 인덱스까지 모두 X인지 확인
            if (map[i] == 'X' && map[i + 1] == 'X'
                    && map[i + 2] == 'X'
                    && map[i + 3] == 'X') {
                //네 개의 X를 발견하면 모두 A로 변경
                map[i] = 'A';
                map[i + 1] = 'A';
                map[i + 2] = 'A';
                map[i + 3] = 'A';
            }
        }

        //연속한 2개의 X == B
        for (int i = 0; i <= map.length - 2; i++) {
            //현재 인덱스와 다음 인덱스가 모두 X인지 확인
            if (map[i] == 'X' && map[i + 1] == 'X') {
                //두 요소가 모두 X라면 B로 변경
                map[i] = 'B';
                map[i + 1] = 'B';
            }
        }

        //X가 있는지 체크
        boolean hasX = false; //X가 있는지의 여부를 저장
        for (char value : map) { //map 배열을 순회하면서
            if (value == 'X') { //X를 발견하면 -1를 출력한다
                System.out.println("-1");
                return;
            }
        }

        System.out.println(String.valueOf(map));
    }
}