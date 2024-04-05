class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            // numLog[i] - numLog[i - 1]의 값은 1 또는 10
            // numLog[1] - numLog[0] -> 1 - 0 = 1
            int num = numLog[i] - numLog[i - 1];

            switch (num) {
                // num이 1일 경우 'w'
                case 1:
                    answer += 'w';
                    break;
                // num이 -1일 경우 's'
                case -1:
                    answer += 's';
                    break;
                // num이 10일 경우 'd'
                case 10:
                    answer += 'd';
                    break;
                // num이 -10일 경우 'a'
                case -10:
                    answer += 'a';
                    break;
                default:
                    break;
            }
        }

        // [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]
        // 1, -1, 10, -10, 1, -1, 10, -10, -1, -1, 1 -> "wsdawsdassw"
        return answer;
    }
}
