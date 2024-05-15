class Solution {
    public int solution(int n) {
        // Math.sqrt(): 제곱근 반환
        // 나머지가 0일 경우 n은 제곱수
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
