class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // [s, e, k] -> [0, 4, 1]
        // s = queries[j][0] -> 0
        // e = queries[j][1] -> 4
        // k = queries[j][2] -> 1

        for (int[] query : queries) {
            // s ≤ i ≤ e -> 0 ≤ i ≤ 4
            for (int i = query[0]; i <= query[1]; i++) {
                // i = k의 배수
                // i를 k로 나눴을 때, 나머지가 0일 경우 k의 배수
                if (i % query[2] == 0) {
                    // arr[i] 증가
                    arr[i]++;
                }
            }
        }

        return arr;
    }
}
