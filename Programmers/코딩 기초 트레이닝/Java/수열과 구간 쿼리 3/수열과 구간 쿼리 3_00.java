class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // arr[i]과 arr[j]을 바꾸기 (arr[i] <-> arr[j])
        // arr[i] = arr[queries[i][0]]
        // arr[j] = arr[queries[i][1]]

        int n = 0;

        for (int i = 0; i < queries.length; i++) {
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;
        }

        return arr;
    }
}
