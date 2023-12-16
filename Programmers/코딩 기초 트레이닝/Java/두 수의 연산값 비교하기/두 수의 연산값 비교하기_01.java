class Solution {
    public int solution(int a, int b) {
        // Math.max() : 최댓값 반환
        // Math.min() : 최솟값 반환
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}
