class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 0;
        int multiply = 1;

        for (int i = 0; i < num_list.length; i++) {
            add += num_list[i]; // 합
            multiply *= num_list[i]; // 곱
        }

        // 합의 제곱 > 곱
        if (add * add > multiply) {
            answer = 1;
        }

        return answer;
    }
}
