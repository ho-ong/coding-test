class Solution {
    public int solution(int a, int b) {
        // Math.max(): 최댓값 반환
        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // "2" + "91" = "291" -> 291
        // 2 * 2 * 91 = 364 (최댓값)
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}
