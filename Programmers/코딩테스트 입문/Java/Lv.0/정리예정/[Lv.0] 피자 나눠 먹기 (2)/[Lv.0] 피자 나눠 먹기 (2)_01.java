class Solution {
    public int solution(int n) {
        // 피자의 판 수 = answer
        // 최소 1판이 필요하므로 1부터 시작
        int answer = 1;

        while (true) {
            // 피자의 조각 수 = answer * 6
            // 피자의 조각 수를 n으로 나눴을 때,
            // 나머지가 0일 경우 answer 반환
            if (answer * 6 % n == 0) {
                return answer;
            }

            // 아닐 경우 answer 증가
            answer++;
        }
    }
}
