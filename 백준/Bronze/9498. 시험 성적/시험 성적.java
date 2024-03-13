import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int exam = sc.nextInt();

		if (90<= exam && exam <= 100){
			System.out.println("A");
		} else if (80<= exam && exam <=89){
			System.out.println("B");
		} else if (70<= exam && exam <=79){
			System.out.println("C");
		} else if (60<= exam && exam <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
