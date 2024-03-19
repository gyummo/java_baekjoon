import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader Br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter Bw = new BufferedWriter (new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(Br.readLine());

		int N = Integer.parseInt(st.nextToken()); //바구니 개수
		int[] arr = new int[N];

		int M = Integer.parseInt(st.nextToken()); //공을 넣는 개수
		for(int i = 0; i < M; i++){
			st = new StringTokenizer(Br.readLine());

			int A = Integer.parseInt(st.nextToken()); //시작~
			int B = Integer.parseInt(st.nextToken()); //~끝
			int C = Integer.parseInt(st.nextToken()); //들어가는 공

			for(int j = A - 1; j < B; j++){
				if (j >= 0 && j < N) {
					arr[j] = C;

				}
			}
		}
		for (int k = 0; k < arr.length; k++){
			Bw.write(arr[k] + " ");
		}

		Bw.flush();
	}
}