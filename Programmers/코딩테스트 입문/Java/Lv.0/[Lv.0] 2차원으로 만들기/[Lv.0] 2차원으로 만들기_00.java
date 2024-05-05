class Solution {
    public int[][] solution(int[] num_list, int n) {
        // new int[행][열]
        int[][] answer = new int[num_list.length / n][n];
        int cnt = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                // i = 0, j = 0 -> answer[0][0] = numbers[0]
                // answer[0][0], answer[0][1], answer[1][0], answer[1][1], ...
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }

        return answer;
    }
}
