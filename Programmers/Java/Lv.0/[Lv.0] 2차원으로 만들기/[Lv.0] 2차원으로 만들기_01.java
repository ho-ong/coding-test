class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            // answer[0][0], answer[0][1], answer[1][0], answer[1][1], ...
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
