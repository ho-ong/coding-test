import java.util.*;

class Solution {
    public int solution(int[] array) {
        // array 배열 오름차순 정렬
        Arrays.sort(array);
        int answer = 0;
        int max = array[array.length - 1]; // 최댓값
        int[] cnt = new int[max + 1]; // 빈도수

        // 빈도수 구하기
        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }

        max = cnt[0]; // 최댓값 초기화

        // 최빈값 구하기
        for (int i = 1; i < cnt.length; i++) {
            // 최댓값 < 빈도수
            // 빈도수가 클 경우 최빈값은 1개이다.
            if (max < cnt[i]) {
                // 최댓값 변경
                max = cnt[i];
                answer = i;
            // 최댓값 = 빈도수
            // 최댓값과 빈도수가 같을 경우 최빈값은 여러 개이다.
            } else if (max == cnt[i]) {
                answer = -1;
            }
        }

        return answer;
    }
}
