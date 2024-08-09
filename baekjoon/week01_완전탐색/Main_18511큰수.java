import java.io.*;
import java.util.*;

public class Main_18511큰수 {
    static int N;
    static Set<Integer> kSet;
    static int maxNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        N = Integer.parseInt(firstLine[0]);

        String[] kElements = br.readLine().split(" ");
        kSet = new HashSet<>();
        for (String kElement : kElements) {
            kSet.add(Integer.parseInt(kElement));
        }

        maxNumber = 0;
        findLargestNumber("", 0);
        System.out.println(maxNumber);
    }

    private static void findLargestNumber(String currentNumber, int currentSum) {
        if (currentSum > N) {
            return;
        }
        if (currentSum <= N && currentSum > maxNumber) {
            maxNumber = currentSum;
        }

        for (int num : kSet) {
            String newNumber = currentNumber + num;
            int newSum = Integer.parseInt(newNumber);
            findLargestNumber(newNumber, newSum);
        }
    }
}
