class Solution {
    public int solution(int n) {
        int answer = 0;

        // 합성수: 약수의 개수가 세 개 이상인 수

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            // 약수 구하기
            for (int j = 1; j <= i; j++) {
                // i를 j로 나눴을 때, 나머지가 0일 경우 n의 약수
                if (i % j == 0) {
                    // cnt 1씩 증가
                    cnt += 1;
                }
            }

            // 합성수 구하기
            // cnt가 3보다 크거나 같을 경우
            if (cnt >= 3) {
                // answer 1씩 증가
                answer += 1;
            }
        }

        return answer;
    }
}
