class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1; // 팩토리얼 (1부터 시작)

        // n이 fac보다 크거나 같을 경우
        // 3628800 >= 1
        while (n >= fac) {
            // answer 증가
            // 1, 2, ..., 9, 10
            answer++;

            // 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800
            fac *= answer;
        }

        // - 1 하는 이유?
        return answer - 1;
    }
}
