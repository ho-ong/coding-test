class Solution {
    public int solution(int n, int k) {
        // 금액 = 양꼬치 + 음료수 - 서비스 음료수
        // (10 * 12000) + (3 * 2000) - (10 / 10 * 2000) = 124000
        return (n * 12000) + (k * 2000) - (n / 10 * 2000);
    }
}
