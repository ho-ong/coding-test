class Solution {
    public int solution(int[] num_list) {
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int num : num_list) {
            // num_list 배열의 원소의 합, 곱을 구하기
            sum += num;
            mul *= num;
        }

        // 합의 제곱이 클 경우 1, 아닐 경우 0
        return sum * sum > mul ? 1 : 0;
    }
}
