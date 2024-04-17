class Solution {
    public int[][] solution(int[] num_list, int n) {
        // [1, 2, 3, 4, 5, 6, 7, 8] -> 8 / 2 = 4
        // new int[행][열] -> new int[4][2]
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            // i = 0 -> answer[0 / 2][0 % 2] = numbers[0]
            // answer[0][0], answer[0][1], answer[1][0], answer[1][1], ...
            // [1, 2, 3, 4, 5, 6, 7, 8] -> answer[4][2] -> [[1, 2], [3, 4], [5, 6], [7, 8]]
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
