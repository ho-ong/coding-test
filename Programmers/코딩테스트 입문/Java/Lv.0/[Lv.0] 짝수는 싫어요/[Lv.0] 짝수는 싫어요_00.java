class Solution {
    public int[] solution(int n) {
        // + 1을 하는 이유?
        // 입출력 예의 n이 15일 때, result의 배열 길이는 8이다.
        // 15 / 2 = 7이므로 8이 나오려면 n에 + 1을 해야 한다.
        int[] answer = new int[(n + 1) / 2];

        // 홀수는 1부터 시작, 2씩 증가 (1, 3, 5, ...)
        for (int i = 1; i <= n; i += 2) {
            // i가 1일 경우 answer[0] = 1
            answer[i / 2] = i;
        }

        return answer;
    }
}
