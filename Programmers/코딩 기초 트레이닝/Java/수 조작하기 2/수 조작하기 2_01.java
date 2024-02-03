class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i - 1];

            switch (num) {
                case 1: // 1: w
                    answer += 'w';
                    break;
                case -1: // -1: s
                    answer += 's';
                    break;
                case 10: // 10: d
                    answer += 'd';
                    break;
                case -10: // -10: a
                    answer += 'a';
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}
