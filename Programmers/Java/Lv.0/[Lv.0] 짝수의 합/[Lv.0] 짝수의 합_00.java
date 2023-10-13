class Solution {
    public int solution(int n) {
        int answer = 0;

        // 홀수 구하기 (2부터 시작, 2씩 증가)
        for (int i = 2; i <= n; i += 2) {
            // 짝수를 모두 더하기
            answer += i;
        }

        return answer;
    }
}
