import java.util.*;
import java.io.*;

public class Main_5568카드 {
        public static int NUMBER_OF_CARD;
        public static int NUMBER_OF_SELECT;
        public static String[] card;
        public static boolean[] visited;
        public static HashSet<String> hs = new HashSet<String>();

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            NUMBER_OF_CARD = Integer.parseInt(br.readLine());
            NUMBER_OF_SELECT = Integer.parseInt(br.readLine());
            card = new String[NUMBER_OF_CARD];
            for (int i = 0; i < NUMBER_OF_CARD; i++) {
                card[i] = br.readLine();
            }
            visited = new boolean[NUMBER_OF_CARD];
            selectCard(NUMBER_OF_SELECT, "");

            // 결과를 출력합니다.
            System.out.println(hs.size());

            br.close();
        }

        public static void selectCard(int remain, String k) {
            if (remain == 0) {
                hs.add(k);
                return;
            }
            for (int i = 0; i < NUMBER_OF_CARD; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    selectCard(remain - 1, k + card[i]);
                    visited[i] = false;
                }
            }
        }
    }

