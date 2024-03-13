import java.util.Scanner;
import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt(); // 시간 입력
        int M = sc.nextInt(); // 분 입력
        int C = sc.nextInt(); // 조리 시간 입력
        
        H += C / 60;
        M += C % 60;

        if (M >= 60) { //분이 60분을 초과할 경우
        	M -= 60;
        	H++;
        }
        
        if (H >= 24) { //시간이 24시를 초과할 경우
            H %= 24;
        }

        System.out.printf(H + " " + M);
    }
}

