class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            // n의 순서쌍 = n의 약수
            // n을 i로 나눴을 때, 나머지가 0일 경우 n의 약수
            if (n % i == 0) {
                // answer 증가
                answer++;
            }
        }

        return answer;
    }
}
