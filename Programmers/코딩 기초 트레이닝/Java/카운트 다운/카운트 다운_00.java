class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
            // start 감소
            answer[i] = start--;
        }

        return answer;
    }
}
