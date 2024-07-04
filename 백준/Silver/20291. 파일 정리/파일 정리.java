import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    //문제
    //1. 바탕화면에 있는 파일의 개수 N개가 주어진다.
    //N개의 줄에 바탕화면에 있는 파일의 이름이 주어진다.
    //확장자의 이름과 그 확장자 파일의 개수를 한 줄에 하나씩 출력한다.
    //확장자가 여러개 있는 경우 확장자 이름의 사전순으로 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 파일 개수

        // HashMap을 사용하여 확장자별 개수를 저장
        Map<String, Integer> extensionCount = new HashMap<>();

        // 파일 이름을 읽어서 처리
        for (int i = 0; i < N; i++) {
            String filename = br.readLine();
            String extension = getExtension(filename);

            // 기존에 해당 확장자가 있으면 개수를 증가시키고, 없으면 새로 추가
            if (extensionCount.containsKey(extension)) {
                extensionCount.put(extension, extensionCount.get(extension) + 1);
            } else {
                extensionCount.put(extension, 1);
            }
        }

        // 확장자 이름을 사전순으로 정렬하기 위해 TreeMap 사용
        Map<String, Integer> sortedExtensions = new TreeMap<>(extensionCount);

        // 결과 출력
        for (Map.Entry<String, Integer> entry : sortedExtensions.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // 파일 이름에서 확장자를 추출하는 함수
    private static String getExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return ""; // 확장자가 없는 경우
        }
        return filename.substring(dotIndex + 1); // 확장자 리턴
    }
}