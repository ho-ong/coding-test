class Solution {
    public int solution(int hp) {
        int answer = 0;

        // 최소 병력 구하기 (장군개미 -> 병정개미 -> 일개미)
        // 몫 = 마리 (몫을 먼저 구하고, 나머지를 구하기)
        answer += hp / 5; // 23 / 5 = 4
        hp %= 5; // 23 % 5 = 3
        answer += hp / 3; // 3 / 3 = 1
        hp %= 3; // 3 % 3 = 0
        answer += hp / 1; // 3 / 0 = 0

        return answer; // 4 + 1 + 0 = 5
    }
}
