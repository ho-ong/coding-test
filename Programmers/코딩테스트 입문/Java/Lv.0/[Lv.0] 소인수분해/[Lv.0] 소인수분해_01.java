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
                n /= div; // 나누기
                set.add(div); // set에 추가
            } else {
                div++; // 증가
            }
        }

        // set의 원소를 int형으로 변환하여 배열 생성하기
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
