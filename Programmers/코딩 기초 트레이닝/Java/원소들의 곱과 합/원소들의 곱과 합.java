class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i]; // 합
            mul *= num_list[i]; // 곱
        }

        // 합의 제곱 > 곱
        if (sum * sum > mul) {
            answer = 1;
        }

        return answer;
    }
}
