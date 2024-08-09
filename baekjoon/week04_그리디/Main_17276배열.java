import java.util.*;
import java.io.*;

public class Main_17276배열 {
    static int[][] map;
    static int n,d;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = pint(br.readLine());

        //tc마다 반복
        for (int test = 1; test <= tc; test++) {
            //배열의 크기와 회전 각도 호출
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = pint(st.nextToken());
            d = pint(st.nextToken())/45; //회전 각도를 45도로 나누어 회전 횟수 계산

            //회전 방향이 음수인 경우 8방향으로 보정 (0 ~ 7 사이의 값으로 변환)
            if(d<0)d+=8;
            //배열 초기화
            map=new int[n][n];

            //배열의 요소를 map에 저장
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j]=pint(st.nextToken());
                }
            }

            //주어진 횟수만큼 배열을 회전
            for (int i = 0; i < d; i++) {
                spin();
            }

            //회전된 배열을 sb에 저장
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(map[i][j]).append(" ");
                }sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    //배열을 90도 회전시키는 메서드
    static void spin() {
        //배열에 대각선의 값 저장
        int[] backup = new int[n];
        for (int i = 0; i < n; i++)backup[i]=map[i][i];

        //왼쪽 대각선 -> 위
        for (int i = 0; i < n; i++)map[i][i]=map[n/2][i];
        //위 -> 오른쪽 대각선
        for (int i = 0; i < n; i++)map[n/2][i]=map[n-i-1][i];
        //오른쪽 대각선 -> 아래
        for (int i = 0; i < n; i++)map[n-i-1][i]=map[n-i-1][n/2];
        //아래 -> 왼쪽 대각선
        for (int i = 0; i < n; i++)map[i][n/2]=backup[i];
    }

    //문자열을 정수로 변환
    static int pint(String s) {
        return Integer.parseInt(s);
    }
}