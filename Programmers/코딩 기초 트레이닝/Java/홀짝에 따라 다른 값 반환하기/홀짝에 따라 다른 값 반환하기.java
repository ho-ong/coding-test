class Solution {
    public int solution(int n) {
        int answer = 0;

        // n을 2로 나눴을 때, 나머지가 0일 경우
        if (n % 2 == 0) {
            // 짝수는 2부터 시작, 2씩 증가 (2, 4, 6, ...)
            for (int i = 2; i <= n; i += 2) {
                answer += i * i; // i의 제곱의 합
            }
        } else {
            // 홀수는 1부터 시작, 2씩 증가 (1, 3, 5, ...)
            for (int i = 1; i <= n; i += 2) {
                answer += i; // i의 합
            }
        }

        return answer;
    }
}
