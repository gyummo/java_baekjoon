import java.io.*;

public class Main_4779칸토어 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str.trim());
            if (n < 0 || n > 12) {
                continue;
            }

            char[] result = create(n);
            System.out.println(new String(result));
        }

        br.close();
    }

    public static char[] create(int n) {
        int len = (int) Math.pow(3, n);
        char[] set = new char[len];

        for (int i = 0; i < len; i++) {
            set[i] = '-';
        }
        fill(set, 0, len - 1, n);
        return set;
    }

    private static void fill(char[] arr, int start, int end, int depth) {
        if (depth == 0) return;
        int len = end - start + 1;
        int third = len / 3;
        int midStart = start + third;
        int midEnd = start + 2 * third - 1;

        // Mark the middle part as spaces
        for (int i = midStart; i <= midEnd; i++) {
            arr[i] = ' ';
        }

        fill(arr, start, start + third - 1, depth - 1);
        fill(arr, start + 2 * third, end, depth - 1);
    }
}
