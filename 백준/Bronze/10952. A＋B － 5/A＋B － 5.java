import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = "";

		while((s = br.readLine()) != null){
			try {
				int A = Integer.parseInt(s.split(" ")[0]);
				int B = Integer.parseInt(s.split(" ")[1]);
				
			if (A == 0 && B == 0) {
				break;
			}
				bw.write((A + B) + "\n");
				bw.flush();

			} catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
}