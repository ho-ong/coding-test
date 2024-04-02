class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            // 제한사항 참고
            // numLog[i] - numLog[i - 1]의 값은 1 또는 10
            // numLog[1] - numLog[0] -> 1 - 0 = 1
            int num = numLog[i] - numLog[i - 1];

            // num이 1일 경우 "w"
            if (num == 1) {
                answer += "w";
            // num이 -1일 경우 "s"
            } else if (num == -1) {
                answer += "s";
            // num이 10일 경우 "d"
            } else if (num == 10) {
                answer += "d";
            // num이 -10일 경우 "a"
            } else if (num == -10) {
                answer += "a";
            }
        }

        // [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]
        // 1, -1, 10, -10, 1, -1, 10, -10, -1, -1, 1 -> "wsdawsdassw"
        return answer;
    }
}
