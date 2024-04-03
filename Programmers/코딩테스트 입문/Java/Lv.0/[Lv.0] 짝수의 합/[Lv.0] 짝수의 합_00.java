class Solution {
    public int solution(int n) {
        int answer = 0;

        // 짝수는 2부터 시작, 2씩 증가 (2, 4, 6, ...)
        for (int i = 2; i <= n; i += 2) {
            // 짝수를 더하기
            // 2 + 4 + 6 + 8 + 10 = 30
            answer += i;
        }

        return answer;
    }
}
