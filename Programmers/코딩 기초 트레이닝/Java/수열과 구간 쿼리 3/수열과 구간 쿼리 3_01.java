class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // arr[i]과 arr[j]을 바꾸기 (arr[i] <-> arr[j])
        // arr[i] = arr[queries[i][0]]
        // arr[j] = arr[queries[i][1]]

        for (int[] query : queries) {
            // [0, 3], [1, 2], [1, 4]
            int i = query[0];
            int j = query[1];
            int n = arr[i]; // arr[0], arr[1], arr[1]
            arr[i] = arr[j]; // arr[3], arr[2], arr[4]
            arr[j] = n; // arr[0] <-> arr[3], arr[1] <-> arr[2], arr[1] <-> arr[4]
        }

        // [0, 1, 2, 3, 4] -> [3, 1, 2, 0, 4] -> [3, 2, 1, 0, 4] -> [3, 4, 1, 0, 2]
        return arr;
    }
}
