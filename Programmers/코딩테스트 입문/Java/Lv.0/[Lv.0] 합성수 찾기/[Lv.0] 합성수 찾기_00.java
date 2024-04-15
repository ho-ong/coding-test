class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= i; j++) {
                // i를 j로 나눴을 때, 나머지가 0일 경우
                if (i % j == 0) {
                    // cnt 증가
                    cnt += 1;
                }
            }

            // cnt 3보다 크거나 같을 경우
            if (cnt >= 3) {
                // answer 증가
                answer += 1;
            }
        }

        return answer;
    }
}
