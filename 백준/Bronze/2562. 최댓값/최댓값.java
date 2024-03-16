import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int[] Arr = new int [9];

		int max = Arr[0];
		int count = 0;

		for(int i = 0; i < 9; i++) {
			Arr[i] = sc.nextInt();


			if(Arr[i] > max) {
				max = Arr[i];
				count = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}