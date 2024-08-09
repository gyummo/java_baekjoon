import java.util.*;
import java.io.*;

public class Main_25501재귀 {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            String s = br.readLine();
            System.out.println(drome(s) + " " + count);
        }

        br.close();
    }

    public static int recursion(String s, int l, int r){
        count++;

        if(l >= r)
            return 1;
        else if(s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l+1, r - 1);
    }

    public static int drome(String s){
        count = 0;
        return recursion(s, 0, s.length() - 1);
    }
}
