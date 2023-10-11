class Solution {
    public int solution(int n) {
        // n을 7로 나누기 (피자 7조각)
        // 나머지가 있으면 + 1 (최소 피자 1판 필요)
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
