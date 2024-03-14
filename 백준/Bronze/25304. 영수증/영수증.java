import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		/*
	물건들의 총 금액 = X
	구매한 물건의 종류의 수 = N

	가격 = A
	개수 = B

 	X = N * ( A * B )
		 */

		int X = sc.nextInt();
		int N = sc.nextInt();

		int total = 0;

		for(int i = 0; i < N; i++){
			int A = sc.nextInt();
			int B = sc.nextInt();

			total += A * B;

		}

		if(X == total){
			System.out.println("Yes");
		} else if (X != total){
			System.out.println("No");
		}
	}
}