class Solution {
    public int solution(int n) {
        int answer = 0;

        // n을 7로 나누기 (피자 7조각)
        // 나머지가 있을 경우 + 1 (최소 피자 1판 필요)
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }

        return answer;
    }
}
