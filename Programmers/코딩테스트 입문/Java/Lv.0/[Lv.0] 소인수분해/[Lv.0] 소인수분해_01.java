import java.util.*;

class Solution {
    public int[] solution(int n) {
        // set 생성 (중복 제거)
        Set<Integer> set = new HashSet<>();
        int div = 2; // 2부터 시작

        // 소인수분해 구하기 (2부터 시작)
        while (n >= 2) {
            // 나머지가 0일 경우 n의 소인수
            if (n % div == 0) {
                n /= div;
                set.add(div);
            } else {
                div++;
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
