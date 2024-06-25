class Solution {
    public int solution(int a, int b) {
        // Math.max(): 최댓값 반환
        // Integer.parseInt(): 정수 변환
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
