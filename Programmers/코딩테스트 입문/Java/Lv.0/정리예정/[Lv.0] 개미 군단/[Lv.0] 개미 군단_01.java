class Solution {
    public int solution(int hp) {
        // 최소 병력 구하기 (장군개미 -> 병정개미 -> 일개미)
        // 몫 = 마리 (몫을 먼저 구하고, 나머지를 구하기)
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
    }
}
