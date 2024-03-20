import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] Arr = new double[N];

		double MAX = 0;

		//최대값 찾기 + 점수 입력
		for(int i = 0; i < N; i++){
			Arr[i] = sc.nextInt();

			if(Arr[i] > MAX){
				MAX = Arr[i];
			}
		}

		//점수의 총합
		double sum = 0;
		for(int i = 0; i < N; i++) {
			Arr[i] = (Arr[i] / MAX) * 100;
			sum += Arr[i];

		}

		double Avg = sum / N;
		System.out.println(Avg);
	}
}