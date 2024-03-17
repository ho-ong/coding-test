import java.util.*;

class Solution {
    public int solution(int[] array) {
        // map 생성 (키, 값 저장)
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        int max = 0; // 최댓값

        for (int num : array) {
            // map.getOrDefault(key, default)
            // map의 key에 찾는 값이 있을 경우 해당 key의 값 반환,
            // 없을 경우 null 대신 default 값 반환

            // 빈도수 구하기
            // [1, 2, 3, 3, 3, 4]
            // 1, 2, 4의 경우 0 + 1 -> 1
            // 3의 경우 0 + 1, 1 + 1, 2 + 1 -> 3
            int cnt = map.getOrDefault(num, 0) + 1; // 빈도수

            // 최빈값 구하기
            // 최댓값 < 빈도수
            // 최댓값과 빈도수가 같지 않을 경우 최빈값은 1개이다.
            if (max < cnt) {
                // 최댓값 변경 (0 -> 1 -> 3)
                max = cnt; // 1 = 3
                answer = num; // 3
            // 최댓값 = 빈도수
            // 최댓값과 빈도수가 같을 경우 최빈값은 여러 개이다.
            } else if (max == cnt) {
                answer = -1;
            }

            // map에 키, 값 추가
            // {1: 1, 2: 1, 3: 3, 4: 1}
            map.put(num, cnt);
        }

        return answer;
    }
}
