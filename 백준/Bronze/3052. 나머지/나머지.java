import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[42];
		int count = 0;

		for(int i = 0; i < 10; i++) {
			int A = Integer.parseInt(br.readLine());
			int mod = A % 42;
			arr[mod]++;
		}

		for(int j = 0; j < 42; j++) {
			if(arr[j] > 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}