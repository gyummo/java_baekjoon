import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_2870compare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> numbers = new ArrayList<>();

        // 정규 표현식 패턴 설정
        Pattern pattern = Pattern.compile("\\d+");

        int N = Integer.parseInt(br.readLine()); // 종이의 줄의 개수 N

        // 각 줄을 읽어 숫자를 추출하여 리스트에 저장
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String num = matcher.group().replaceAll("^0+", ""); // 숫자 추출 후 앞의 0 제거
                numbers.add(num.isEmpty() ? "0" : num); // 숫자가 없으면 "0"으로 처리
            }
        }

        // 비내림차순으로 정렬하기
        Collections.sort(numbers, (o1, o2) -> {
            if (o1.length() == o2.length()) { // 길이가 같으면 사전순으로 정렬
                return o1.compareTo(o2);
            } else { // 길이가 다르면 길이가 짧은 순서대로 정렬
                return o1.length() - o2.length();
            }
        });

        // 결과를 StringBuilder에 추가
        for (String num : numbers) {
            sb.append(num).append('\n');
        }

        System.out.print(sb); // 결과 출력

        br.close();
    }
}