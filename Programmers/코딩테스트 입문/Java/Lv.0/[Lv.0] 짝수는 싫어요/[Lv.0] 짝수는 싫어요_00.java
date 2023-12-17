class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];

        // 배열의 홀수 원소 구하기 (1부터 시작, 2씩 증가)
        for (int i = 1; i <= n; i += 2) {
            // i가 1일 경우 answer[0] = 1
            answer[i / 2] = i;
        }

        return answer;
    }
}
