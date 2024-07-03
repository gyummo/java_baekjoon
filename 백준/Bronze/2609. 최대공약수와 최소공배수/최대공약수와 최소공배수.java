import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //문제
        //1. 두 수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하세요
        //2. 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를
        //3. 둘째 주에는 입력으로 주어진 두 수의 최소공배수를 출력한다

        //최대공배수와 최대공약수를 구할때
        //A, B 두 수가 있을때 약수들을 모두 구하고, B의 약수들을 모두 구한 뒤 공통 된 약수들만 찾아내어 약수들의 곱으로 다시 나타내준다...
        //라는 풀이 방법이 있지만
        //빠르게 구하는 알고리즘 풀이 방법이 있다.

        //유클리즈 호제법
        //두 수 a, b에 대해 a를 b로 나눈 나머지를 구한다.
        //나머지가 0이 될 때까지 반복하여, 나머지가 0이 되었을 때의 b 값이 최대 공약수가 된다

        //공백 분리를 위해 StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 최대 공약수 계산
        int gcdValue = gcd(a, b);

        // 최소 공배수 계산
        int lcmValue = lcm(a, b);

        // 결과 출력
        System.out.println(gcdValue); // 최대 공약수 출력
        System.out.println(lcmValue); // 최소 공배수 출력

        // BufferedReader 닫기
        br.close();
    }

    // 최대 공약수(GCD) 계산 함수
    //재귀와 반복문 두 가지 풀이 방법이 있다.
    //재귀를 쓰면 훨씬 간단하게 풀 수 있다.

    //반복문 풀이 방식
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; //나머지를 구한다

            //변환
            a = b;
            b = r;
        }
        return a;
    }

    // 최소 공배수(LCM) 계산 함수
    public static int lcm(int a, int b) {
        // 두 수의 곱을 최대 공약수로 나누어 최소 공배수를 계산
        return (a * b) / gcd(a, b);
    }
}