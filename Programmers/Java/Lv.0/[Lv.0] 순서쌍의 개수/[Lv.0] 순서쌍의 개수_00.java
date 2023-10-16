class Solution {
    public int solution(int n) {
        int answer = 0;

        // n의 약수 구하기
        for (int i = 1; i <= n; i++) {
            // 나머지가 0이면 n의 약수
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
