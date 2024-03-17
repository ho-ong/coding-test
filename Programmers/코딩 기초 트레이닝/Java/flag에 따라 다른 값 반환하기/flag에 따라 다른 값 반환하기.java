class Solution {
    public int solution(int a, int b, boolean flag) {
        // true일 경우 a + b, false일 경우 a - b
        // a + b -> (-4) + 7 = 3
        return flag ? a + b : a - b;
    }
}
