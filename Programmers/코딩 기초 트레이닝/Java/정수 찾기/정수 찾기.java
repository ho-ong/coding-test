class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            // num_list의 원소 = n
            if (num_list[i] == n) {
                answer = 1;
            }
        }

        return answer;
    }
}
