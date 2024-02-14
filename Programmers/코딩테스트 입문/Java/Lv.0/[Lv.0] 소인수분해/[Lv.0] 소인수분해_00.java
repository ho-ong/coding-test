import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        // 소인수분해 구하기 (2부터 시작)
        for (int i = 2; i <= n; i++) {
            // 나머지가 0일 경우 n의 소인수
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }

                list.add(i); // 추가
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
