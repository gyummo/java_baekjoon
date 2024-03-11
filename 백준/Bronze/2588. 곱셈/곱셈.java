import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		/*1의 자리 수 */
		int B1 = (B % 10);

		/*10의 자리 수*/
		int B10 = ((B % 100) / 10);

		/*100의 자리 수*/
		int B100 = ((B % 1000) / 100);
		
		int C = (B1 * 100 + (B10 * 1000) + (B100 * 10000));
		
	System.out.println(A * B1); 
	System.out.println(A * B10);
	System.out.println(A * B100);
	System.out.println(A * B);
}
}