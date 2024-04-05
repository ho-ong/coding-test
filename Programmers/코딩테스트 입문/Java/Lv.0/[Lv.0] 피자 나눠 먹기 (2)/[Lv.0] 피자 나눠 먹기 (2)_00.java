class Solution {
    public int solution(int n) {
        int answer = 0;

        // 피자의 판 수 = i
        // 최소 1판이 필요하므로 1부터 시작
        for (int i = 1; i <= n; i++) {
            // 피자의 조각 수 = i * 6
            // 피자의 조각 수를 n으로 나눴을 때,
            // 나머지가 0일 경우 i 반환, 아닐 경우 i 증가
            // 1 * 6 % 6 = 0
            if (i * 6 % n == 0) {
                answer = i; // 1
                break;
            }
        }

        return answer;
    }
}
