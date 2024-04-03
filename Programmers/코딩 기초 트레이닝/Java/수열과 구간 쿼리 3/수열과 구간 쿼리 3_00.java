class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = 0;

        // arr[i]과 arr[j]을 바꾸기 (arr[i] <-> arr[j])
        // arr[i] = arr[queries[i][0]]
        // arr[j] = arr[queries[i][1]]

        for (int i = 0; i < queries.length; i++) {
            // [0, 3], [1, 2], [1, 4]
            n = arr[queries[i][0]]; // arr[0], arr[1], arr[1]
            arr[queries[i][0]] = arr[queries[i][1]]; // arr[3], arr[2], arr[4]
            arr[queries[i][1]] = n; // arr[0] <-> arr[3], arr[1] <-> arr[2], arr[1] <-> arr[4]
        }

        // [0, 1, 2, 3, 4] -> [3, 1, 2, 0, 4] -> [3, 2, 1, 0, 4] -> [3, 4, 1, 0, 2]
        return arr;
    }
}
