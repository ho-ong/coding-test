import java.util.*;

class Solution {
    public int solution(int[] array) {
        // array 배열 오름차순 정렬 [1, 2, 3, 3, 3, 4]
        Arrays.sort(array);
        int answer = 0;
        int max = array[array.length - 1]; // 최댓값 5
        int[] cnt = new int[max + 1]; // 빈도수 [0, 0, 0, 0, 0, 0]

        // 빈도수 구하기
        for (int i = 0; i < array.length; i++) {
            // array[0] -> cnt[1] 1 증가
            // array[1] -> cnt[2] 1 증가
            // array[2], array[3], array[4] -> cnt[3] 3 증가
            // array[5] -> cnt[4] 1 증가
            // [0, 1, 1, 3, 1, 0]
            cnt[array[i]]++;
        }

        max = cnt[0]; // 최댓값 초기화

        // 최빈값 구하기
        for (int i = 1; i < cnt.length; i++) {
            // 최댓값 < 빈도수
            // 최댓값과 빈도수가 같지 않을 경우 최빈값은 1개이다.
            if (max < cnt[i]) {
                // 최댓값 변경 (0 -> 1 -> 3)
                max = cnt[i]; // 1 = 3
                answer = i; // 3
            // 최댓값 = 빈도수
            // 최댓값과 빈도수가 같을 경우 최빈값은 여러 개이다.
            } else if (max == cnt[i]) {
                answer = -1;
            }
        }

        return answer;
    }
}
