import java.util.*;

class Solution {
    public int[] solution(int n) {
        // set 생성 (중복 제거)
        Set<Integer> set = new HashSet<>();
        int cnt = 2;

        // 소인수: 자연수의 약수 중 소수인 수

        // 소인수 구하기
        // 2 ≤ n ≤ 10,000 (2부터 시작)
        while (n >= 2) {
            // n을 cnt로 나눴을 때, 나머지가 0일 경우
            if (n % cnt == 0) {
                // 소수 구하기
                n /= cnt;

                // set에 원소 추가
                set.add(cnt);
            } else {
                // cnt 증가
                cnt++;
            }
        }

        // 세트 -> 배열
        // 세트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
