import java.util.*;
import java.io.*;

public class Main_2141우체국 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //마을의 개수
        int N = Integer.parseInt(st.nextToken());

        long[] villagePos = new long[N]; //마을의 위치
        long[] people = new long[N]; //인구 수
        long peopleSum = 0; //전체 인구 수

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            villagePos[i] = Long.parseLong(st.nextToken());
            people[i] = Long.parseLong(st.nextToken());
            peopleSum += people[i]; // 전체 인구 수 합산
        }

        //마을의 위치를 기준으로 오름차순으로 정렬
        quickSort(villagePos, people, 0, N - 1);

        //인구의 절반 이상이 되는 첫번째 마을의 위치
        long compareSum = 0;
        for (int i = 0; i < N; i++) {
            compareSum += people[i]; //현재까지의 인구수 합산
            //인구의 절반 이상이 되는 마을 위치
            if (compareSum >= (peopleSum + 1) / 2) {
                System.out.println(villagePos[i]);
                break;
            }
        }

        br.close();
    }

    private static void quickSort(long[] villagePos, long[] people, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(villagePos, people, left, right);
            quickSort(villagePos, people, left, pivotIndex - 1);
            quickSort(villagePos, people, pivotIndex + 1, right);
        }
    }

    private static int partition(long[] villagePos, long[] people, int left, int right) {
        long pivot = villagePos[right]; //오른쪽 끝 요소를 설정
        int i = left - 1; //피벗보다 작은 요소의 인덱스

        for (int j = left; j < right; j++) {
            if (villagePos[j] <= pivot) { //현재 요소가 피벗보다 작거나 같으면
                i++; //피벗보다 작은 요소의 인덱스 증가
                swap(villagePos, i, j); //위치 교환
                swap(people, i, j); //인구 배열에서 위치 교환
            }
        }

        swap(villagePos, i + 1, right);
        swap(people, i + 1, right);
        return i + 1;
    }

    private static void swap(long[] arr, int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
