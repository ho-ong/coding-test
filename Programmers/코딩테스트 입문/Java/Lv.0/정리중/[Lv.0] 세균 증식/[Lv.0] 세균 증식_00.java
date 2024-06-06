class Solution {
    public int solution(int n, int t) {
        int answer = n; // 세균의 수

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }
}
