class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1; // 팩토리얼 (1부터 시작)

        // 팩토리얼 구하기
        // n이 fac보다 크거나 같을 경우
        // 3628800 >= 10!
        while (n >= fac) {
            // answer 증가
            answer++;
            fac *= answer;
        }

        // - 1 하는 이유?
        // answer가 11이 되었을 때, fac이 n보다 커지므로 반복문을 종료한다.
        // 3628800 = 10!을 구해야 하므로 - 1을 해야 한다.
        return answer - 1;
    }
}
