class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // arr[i]과 arr[j]을 바꾸기 (arr[i] <-> arr[j])
        // arr[i] = arr[queries[i][0]]
        // arr[j] = arr[queries[i][1]]

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int n = arr[i];
            arr[i] = arr[j];
            arr[j] = n;
        }

        return arr;
    }
}
