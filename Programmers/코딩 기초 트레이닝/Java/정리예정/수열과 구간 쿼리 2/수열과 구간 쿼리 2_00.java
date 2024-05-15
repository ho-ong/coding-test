import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        // Arrays.fill(): 배열의 모든 값을 초기화
        // Integer.MAX_VALUE: 정수의 최댓값
        Arrays.fill(answer, Integer.MAX_VALUE);

        // Arrays.fill(answer, Integer.MAX_VALUE) 하는 이유?
        // 최솟값을 찾기 위한 과정

        // [s, e, k]
        // s = queries[j][0]
        // e = queries[j][1]
        // k = queries[j][2]

        for (int j = 0; j < queries.length; j++) {
            // s ≤ i ≤ e -> 0 ≤ i ≤ 4
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                // i > k -> i > 2
                if (arr[i] > queries[j][2]) {
                    // 가장 작은 arr[i] 찾기
                    // Math.min(): 최솟값 반환
                    // answer[j]와 arr[i] 중 최솟값 반환
                    answer[j] = Math.min(answer[j], arr[i]);
                }
            }

            // 특정 쿼리의 답이 존재하지 않을 경우 -1
            if (answer[j] == Integer.MAX_VALUE) {
                answer[j] = -1;
            }
        }

        return answer;
    }
}
