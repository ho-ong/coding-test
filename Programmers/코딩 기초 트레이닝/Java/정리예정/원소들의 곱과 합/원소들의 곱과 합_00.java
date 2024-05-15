class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int i = 0; i < num_list.length; i++) {
            // num_list 배열의 원소의 합, 곱을 구하기
            sum += num_list[i];
            mul *= num_list[i];
        }

        // 합의 제곱이 클 경우 1, 아닐 경우 0
        if (sum * sum > mul) {
            answer = 1;
        }

        return answer;
    }
}
