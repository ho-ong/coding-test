class Solution {
    public int solution(int slice, int n) {
        // 피자 1판 slice조각, 최소 피자 1판 필요

        // n을 slice로 나눴을 때, 나머지가 0일 경우 n / slice,
        // 아닐 경우 n / slice + 1 (최소 1판이 필요하므로 + 1)
        // 10 / 7 + 1 = 2
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
