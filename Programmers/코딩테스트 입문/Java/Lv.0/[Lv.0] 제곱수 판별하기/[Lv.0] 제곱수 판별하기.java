class Solution {
    public int solution(int n) {
        // Math.sqrt() : 제곱근 반환
        // n이 제곱근일 경우 1, 아닐 경우 2
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
