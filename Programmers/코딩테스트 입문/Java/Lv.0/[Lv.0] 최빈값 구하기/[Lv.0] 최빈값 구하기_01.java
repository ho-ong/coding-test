import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        int max = 0; // 최댓값

        for (int num : array) {
            // getOrDefault(key, defaultValue)
            // 찾는 key가 존재할 경우 찾는 key의 값을 반환, null일 경우 default 값을 반환
            int cnt = map.getOrDefault(num, 0) + 1; // 빈도수

            // 최빈값 구하기
            if (max < cnt) {
                // 최빈값이 1개일 경우 i
                max = count;
                answer = num;
            } else if (max == cnt) {
                // 최빈값이 여러 개일 경우 -1
                answer = -1;
            }

            map.put(num, cnt);
        }

        return answer;
    }
}
