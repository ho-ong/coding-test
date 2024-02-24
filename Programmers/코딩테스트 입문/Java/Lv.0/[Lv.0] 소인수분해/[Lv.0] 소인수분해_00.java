import java.util.*;

class Solution {
    public int[] solution(int n) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // 소인수분해 구하기 (2부터 시작)
        for (int i = 2; i <= n; i++) {
            // 나머지가 0일 경우 n의 소인수
            if (n % i == 0) {
                // 나머지가 0일 경우 반복
                while (n % i == 0) {
                    n /= i; // 나누기
                }

                list.add(i); // list에 추가
            }
        }

        // list의 원소를 int형으로 변환하여 배열 생성하기
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
