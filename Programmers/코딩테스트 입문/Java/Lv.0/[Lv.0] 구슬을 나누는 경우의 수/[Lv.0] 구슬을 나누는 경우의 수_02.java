class Solution {
    public long solution(int balls, int share) {
        // 최솟값
        // 3 - 2, 2 -> 1
        share = Math.min(balls - share, share);

        // 기본값
        // share가 0일 경우 1
        if (share == 0) {
            return 1;
        }

        // balls = n, share = m
        // 경우의 수 = n * (n - 1) * (n - 2) * (n - 3) ... (n - m + 1) / m!
        long answer = solution(balls - 1, share - 1); // 2, 0
        answer *= balls;
        answer /= share;
        return answer;
    }
}
