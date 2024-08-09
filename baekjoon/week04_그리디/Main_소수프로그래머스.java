import java.util.*;
import java.io.*;

public class Main_소수프로그래머스 {
    public static void main(String[] args) {
        int n = 437674; //변환할 수
        int k = 3; //변환할 진법 (3진법)

        //solution메서드 호출
        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {

        int result = 0;
        //정수 n을 진법 k로 변환한 문자열
        String re = Integer.toString(n, k);

        //문자열을 0으로 구분하여 분리
        for(String rea : re.split("0")){
            //빈 문자열 무시
            if(rea.equals("")) continue;
            //문자열이 소수인지 확인
            if(isPrime(rea) == false){
                result++; //소수가 아닌 경우 result 증가
            }
        }

        return result;

    }

    public static boolean isPrime(String num){
        long n = Long.parseLong(num);

        //1은 소수가 아님
        if(n == 1){
            return true;
        }

        //2부터 n의 제곱근까지 나눠서 소수 여부 판별
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return true; //나누어 떨어지면 소수가 아님
            }
        }

        return false;
    }
}