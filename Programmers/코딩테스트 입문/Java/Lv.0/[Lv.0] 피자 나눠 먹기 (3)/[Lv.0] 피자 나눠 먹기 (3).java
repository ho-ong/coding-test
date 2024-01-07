class Solution {
    public int solution(int slice, int n) {
        // n을 slice로 나누기 (피자 slice조각)
        // 나머지가 있을 경우 + 1 (최소 피자 1판 필요)
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
