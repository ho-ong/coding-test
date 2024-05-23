class Solution {
    public int solution(int n) {
        int answer = 0;

        // 피자의 판 수 = i
        // 최소 피자 1판 필요 (1부터 시작)
        for (int i = 1; i <= n; i++) {
            // 피자의 조각 수 = 피자의 판 수 * 6
            // 피자의 조각 수를 n으로 나눴을 때,
            // 나머지가 0일 경우 반환, 아닐 경우 증가
            if (i * 6 % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
