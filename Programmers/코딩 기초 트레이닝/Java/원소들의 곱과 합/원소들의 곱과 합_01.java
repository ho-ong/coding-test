class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for (int num : num_list) {
            sum += num; // 합
            mul *= num; // 곱
        }

        // 합의 제곱 > 곱
        return sum * sum > mul ? 1 : 0;
    }
}
