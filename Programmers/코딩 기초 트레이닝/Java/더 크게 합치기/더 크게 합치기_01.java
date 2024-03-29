class Solution {
    public int solution(int a, int b) {
        // Math.max(): 최댓값 반환
        // Integer.parseInt(): 정수로 변환

        // a + b와 b + a 중 최댓값 반환
        // 9 + "" + 91 -> 991 (최댓값)
        // 91 + "" + 9 -> 919
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
