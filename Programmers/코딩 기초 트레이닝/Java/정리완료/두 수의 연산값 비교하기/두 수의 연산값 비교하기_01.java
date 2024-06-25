class Solution {
    public int solution(int a, int b) {
        // Math.max(): 최댓값 반환
        // Integer.parseInt(): 정수 변환
        // String.valueOf(): 문자열 변환
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}
