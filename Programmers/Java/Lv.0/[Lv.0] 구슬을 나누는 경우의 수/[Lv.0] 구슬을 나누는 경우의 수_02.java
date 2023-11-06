class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share); // 최솟값

        if (share == 0) {
            return 1;
        }

        // balls = n, share = m
        // 경우의 수 = n * (n - 1) * (n - 2) * (n - 3) ... (n - m + 1) / m!
        long answer = solution (balls - 1, share - 1);
        answer *= balls;
        answer /= share;
        return answer;
    }
}
