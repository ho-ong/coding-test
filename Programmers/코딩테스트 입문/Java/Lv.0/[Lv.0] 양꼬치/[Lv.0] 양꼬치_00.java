class Solution {
    public int solution(int n, int k) {
        // 금액 = 양꼬치 + (음료수 - 서비스 음료수)
        int free = n / 10; // 서비스 음료수
        int answer = (n * 12000) + (k - free) * 2000;
        return answer;
    }
}
