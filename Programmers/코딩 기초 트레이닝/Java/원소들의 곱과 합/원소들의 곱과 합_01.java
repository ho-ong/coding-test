class Solution {
    public int solution(int[] num_list) {
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int num : num_list) {
            // [3, 4, 5, 2, 1]
            sum += num; // 합 15
            mul *= num; // 곱 120
        }

        // 합의 제곱이 곱보다 클 경우 1, 아닐 경우 0
        // 합의 제곱 > 곱
        // 225 > 120
        return sum * sum > mul ? 1 : 0;
    }
}
