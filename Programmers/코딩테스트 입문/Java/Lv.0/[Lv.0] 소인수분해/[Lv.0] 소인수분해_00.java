import java.util.*;

class Solution {
    public int[] solution(int n) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // 소인수: 자연수의 약수 중 소수인 수

        // 소인수 구하기
        // 2 ≤ n ≤ 10,000 (2부터 시작)
        for (int i = 2; i <= n; i++) {
            // n을 i로 나눴을 때, 나머지가 0일 경우s
            if (n % i == 0) {
                // n을 i로 나눴을 때, 나머지가 0일 경우
                while (n % i == 0) {
                    // 소수 구하기
                    n /= i;
                }

                // list에 원소 추가
                list.add(i);
            }
        }

        // 리스트 -> 배열
        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
