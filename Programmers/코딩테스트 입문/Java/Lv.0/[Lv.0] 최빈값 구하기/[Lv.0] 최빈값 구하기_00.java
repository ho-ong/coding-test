import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 오름차순 정렬
        int answer = 0;
        int max = 0; // 최댓값
        max = array[array.length - 1];
        int[] cnt = new int[max + 1]; // 빈도수

        // 배열의 원소가 같은지 확인
        for (int i = 0; i < array.length; i++) {
            // 배열의 원소가 같을 경우 count 증가
            cnt[array[i]]++;
        }

        max = cnt[0];

        // 최빈값 구하기
        for (int i = 1; i < cnt.length; i++) {
            if (max < cnt[i]) {
                // 최빈값이 1개일 경우 i
                max = cnt[i];
                answer = i;
            } else if (max == cnt[i]) {
                // 최빈값이 여러 개일 경우 -1
                answer = -1;
            }
        }

        return answer;
    }
}
