class Solution {
    public int solution(int n) {
        int answer = 0;

        // n의 순서쌍 = n의 약수
        for (int i = 1; i <= n; i++) {
            // 나머지가 0일 경우 n의 약수
            if (n % i == 0) {
                answer++; // 증가
            }
        }

        return answer;
    }
}
