import java.util.*;
import java.io.*;

public class Main_21921블로그 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //배열의 크기
        int M = Integer.parseInt(st.nextToken()); //부분 배열의 길이

        st = new StringTokenizer(br.readLine());
        //배열을 1-based인덱스로 사용하기 위해 N + 1 크기로 설정
        int[] arr = new int[N + 1];
        //초기 부분 배열의 합
        int total = 0;

        for (int i = 1; i <= N; i++) {
            //배열에 요소 저장
            arr[i] = Integer.parseInt(st.nextToken());
            if (i <= M) {
                //처음 M개의 요소 합
                total += arr[i];
            }
        }

        int MAX = total; //초기 최대값
        int count = (MAX != 0) ? 1 : 0; //0이 아닌 경우 개수 1로 설정

        //슬라이딩 윈도우 방식으로 나머지 부분 배열의 합
        for (int i = 2; i <= N - M + 1; i++) {
            total -= arr[i - 1]; //윈도우의 왼쪽 끝 요소 제거
            total += arr[i + M - 1]; //윈도우의 오른쪽 끝 요소 추가

            //합이 최대값보다 크면 최대값 업데이트 및 개수 1로 설정
            if (MAX < total) {
                MAX = total;
                count = 1;
            //합이 최대값과 같으면 개수 증가
            } else if (MAX == total) {
                count++;
            }
        }

        // 결과 출력
        if (MAX == 0) {
            //최대값이 0인 경우 SAD 출력
            System.out.println("SAD");
        } else {
            System.out.println(MAX);
            System.out.println(count);
        }

        br.close();
    }
}