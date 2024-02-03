class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i - 1];

            if (num == 1) {
                answer += "w"; // 1: w
            } else if (num == -1) {
                answer += "s"; // -1: s
            } else if (num == 10) {
                answer += "d"; // 10: d
            } else if (num == -10) {
                answer += "a"; // -10: a
            }
        }

        return answer;
    }
}
