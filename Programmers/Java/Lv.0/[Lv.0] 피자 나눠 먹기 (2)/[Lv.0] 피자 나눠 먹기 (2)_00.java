class Solution {
    public int solution(int n) {
        int answer = 0;

        // 피자의 총 조각 수 = 피자의 판 수 * 6
        // n으로 나누기
        // 나머지가 없으면 피자의 판 수 반환
        // 나머지가 있으면 피자의 판 수 증가
        for (int i = 1; i <= n; i++) {
            if (i * 6 % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
