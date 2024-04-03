class Solution {
    public int solution(int[] num_list) {
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int num : num_list) {
            // num_list 배열의 원소의 합, 곱을 구하기
            sum += num; // 3 + 4 + 5 + 2 + 1 = 15
            mul *= num; // 3 * 4 * 5 * 2 * 1 = 120
        }

        // 합의 제곱이 클 경우 1, 아닐 경우 0
        // 15 * 15 = 225
        // 225 > 120
        return sum * sum > mul ? 1 : 0;
    }
}
