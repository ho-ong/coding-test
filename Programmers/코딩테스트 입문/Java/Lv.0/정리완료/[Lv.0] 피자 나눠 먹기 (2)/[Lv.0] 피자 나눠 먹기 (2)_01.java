class Solution {
    public int solution(int n) {
        // 피자의 판 수 = answer
        // 최소 피자 1판 필요 (1부터 시작)
        int answer = 1;

        while (true) {
            // 피자의 조각 수 = 피자의 판 수 * 6
            // 피자의 조각 수를 n으로 나눴을 때,
            // 나머지가 0일 경우 반환, 아닐 경우 증가
            if (answer * 6 % n == 0) {
                return answer;
            }

            answer++;
        }
    }
}
