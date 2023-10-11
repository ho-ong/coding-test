class Solution {
    public int solution(int n) {
        int answer = 1;

        // 피자의 총 조각 수 = 피자의 판 수 * 6
        // n으로 나누기
        // 나머지가 없으면 피자의 판 수 반환
        // 나머지가 있으면 피자의 판 수 증가
        while (true) {
            if (answer * 6 % n == 0) {
                return answer;
            }
        }

        answer++;
    }
}
