class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            // count 초기화
            int count = 0;

            for (int j = 1; j <= i; j++) {
                // 나머지가 0일 경우
                if (i % j == 0) {
                    // count 1씩 증가
                    count += 1;
                }
            }

            // count가 3보다 크거나 같을 경우
            if (count >= 3) {
                // count 1씩 증가
                answer += 1;
            }
        }

        return answer;
    }
}
