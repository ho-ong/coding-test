class Solution {
    public int solution(int hp) {
        int answer = 0;

        // 최소한의 병력 (큰 값 먼저 나누기, 나머지 나누기)
        // 장군개미 -> 병정개미 -> 일개미
        answer += hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp / 1;

        return answer;
    }
}
