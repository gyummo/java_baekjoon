import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int Max = Math.max(A, Math.max(C, B));
		int prize = 0;
		/* 같은 눈이 3개가 나오면 10000+ 같은 눈 X 1000 */
		/* 같은 눈이 2개만 나오면 1000 + 같은 눈 X 100 */
		/* 모두 다른 눈이 나오는 경우에는 가장 큰 눈 X 100 */

		/* 3개 다 같을 경우 */
		if (A == B &&  A == C && B == C) {
			prize = 10000 + A * 1000;	
			
			
		} else if (A == B  || A == C) {
			prize = (1000 +  A * 100);
		} else if (A == B || B == C){
			prize = (1000 +  B * 100);
		} else if (A == C || B == C){
			prize =(1000 +  C * 100);
			
			
		} else {
			prize = Max * 100;
		}
		
		System.out.println(prize);

	}
}