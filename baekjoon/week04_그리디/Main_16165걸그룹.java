import java.util.*;
import java.io.*;

public class Main_16165걸그룹 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()); //팀의 수
        int m = Integer.parseInt(st.nextToken()); //멤버 이름

        //key: 팀 이름 value: 팀 멤버 리스트
        HashMap<String, ArrayList<String>> mem = new HashMap<>();
        //key: 멤버 이름 value: 팀 이름
        HashMap<String, String> team = new HashMap<>();

        //팀 정보 입력
        for (int i = 0; i < n; i++) {

            ArrayList<String> members = new ArrayList<>();

            //팀 이름
            String teamName = br.readLine();
            //팀 멤버 수
            int memberCount = Integer.parseInt(br.readLine());

            //각 팀의 멤버를 members list에 추가하여 team맵에 멤버와 팀 매핑
            for (int j = 0; j < memberCount; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                team.put(memberName, teamName); // 멤버와 팀 매핑
            }
            //key: 팀 이름 value: 멤버 리스트 에 저장
            mem.put(teamName, members); // 팀과 멤버 매핑
        }

        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            String type = br.readLine();

            //쿼리가 0인 경우: 팀 멤버를 정렬하여 출력
            if (type.equals("0")) {
                //key: 팀 이름
                ArrayList<String> members = mem.get(query);
                //멤버 리스트를 오름차순으로 정렬
                Collections.sort(members);
                //정렬된 멤버 리스트를 sb에 추가
                for (String member : members) {
                    sb.append(member).append("\n");
                }
                //1인 경우 멤버의 소속팀 출력
            } else if (type.equals("1")) {
                //멤버 이름을 키로 사용
                sb.append(team.get(query)).append("\n");
            }
        }

        System.out.print(sb);
    }
}

