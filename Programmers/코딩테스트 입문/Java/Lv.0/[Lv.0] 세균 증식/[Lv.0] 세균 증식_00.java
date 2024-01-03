class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            // 2를 곱하기 (n, n * 2, n * 2 * 2, ...)
            answer *= 2;
        }

        return answer;
    }
}
