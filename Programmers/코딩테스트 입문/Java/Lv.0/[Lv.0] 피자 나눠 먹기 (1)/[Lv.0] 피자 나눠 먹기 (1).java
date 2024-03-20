class Solution {
    public int solution(int n) {
        // 피자 1판 7조각, 최소 피자 1판 필요

        // n을 7로 나눴을 때, 나머지가 0일 경우 n / 7,
        // 아닐 경우 n / 7 + 1 (최소 1판이 필요하므로 + 1)
        // 1 / 7 + 1 = 1
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
