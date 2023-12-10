class Solution {
    public int solution(int a, int b, int c) {
        // 세 숫자가 모두 같은 경우
        // 두 숫자는 같고, 나머지 숫자가 다른 경우
        // 세 숫자가 모두 다른 경우
        return a == b && b == c ? (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c) : a == b || b == c || c == a ? (a + b + c) * (a * a + b * b + c * c) : a + b + c;
    }
}
