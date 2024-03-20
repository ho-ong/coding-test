class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int i = 0; i < num_list.length; i++) {
            // [3, 4, 5, 2, 1]
            sum += num_list[i]; // 합 15
            mul *= num_list[i]; // 곱 120
        }

        // 합의 제곱이 곱보다 클 경우 1, 아닐 경우 0
        // 합의 제곱 > 곱
        // 225 > 120
        if (sum * sum > mul) {
            answer = 1;
        }

        return answer;
    }
}
