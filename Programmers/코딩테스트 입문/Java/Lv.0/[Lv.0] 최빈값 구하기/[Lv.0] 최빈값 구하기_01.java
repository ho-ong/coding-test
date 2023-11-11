import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        int answer = 0;
        int max = 0; // 최댓값

        for (int num : array) {
            // getOrDefault(key, defaultValue) : 찾는 key가 존재하면 찾는 key의 값을 반환, 없거나 null이면 default 값을 반환
            int count = map.getOrDefault(num, 0) + 1; // 빈도수

            // 최빈값 구하기
            if (max < count) {
                // 최빈값이 1개면 i
                max = count;
                answer = num;
            } else if (max == count) {
                // 최빈값이 여러 개면 -1
                answer = -1;
            }

            map.put(num, count);
        }

        return answer;
    }
}
