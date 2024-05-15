class Solution {
    public int[] solution(int start_num, int end_num) {
        // + 1 하는 이유?
        // 입출력 예의 start_num이 3, end_num이 10일 때, result의 배열 길이는 8이다.
        // 10 - 3 = 7이므로 8이 나오려면 + 1을 해야 한다.
        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i < answer.length; i++) {
            // start_num 증가
            // i = 0 -> answer[0] = 3, ..., answer[7] = 10
            answer[i] = start_num++;
        }

        return answer;
    }
}
