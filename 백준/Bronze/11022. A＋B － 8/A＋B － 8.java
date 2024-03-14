import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		String s = " ";

		for(int i = 1; i <= T; i++){

			String str = br.readLine();

			int A = Integer.parseInt(str.split(" ")[0]);
			int B = Integer.parseInt(str.split(" ")[1]);

			int C = A + B;

			bw.write("Case #" + i + ": " + A + " + " + B + " = " + C + "\n");
		}
		bw.flush();
	}
}