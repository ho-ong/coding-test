class Solution {
    public int solution(int hp) {
        // 최소한의 병력 (큰 값 먼저 나누기, 나머지 나누기)
        // 장군개미 -> 병정개미 -> 일개미
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
    }
}
