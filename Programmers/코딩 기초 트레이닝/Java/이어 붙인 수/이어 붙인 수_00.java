class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                // 짝수를 이어 붙이기
                even += String.valueOf(num_list[i]);
            } else {
                // 홀수를 이어 붙이기
                odd += String.valueOf(num_list[i]);
            }
        }

        // 짝수와 홀수를 더하기
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
