class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        // ineq가 ">"일 경우
        if (ineq.equals(">")) {
            // eq가 "="일 경우
            if (eq.equals("=")) {
                // n이 m보다 크거나 같을 경우 1, 아닐 경우 0
                answer = n >= m ? 1 : 0;
            // eq가 "!"일 경우
            } else if (eq.equals("!")) {
                // n이 m보다 클 경우 1, 아닐 경우 0
                answer = n > m ? 1 : 0;
            }
        // ineq가 "<"일 경우
        } else if (ineq.equals("<")) {
            // eq가 "="일 경우
            if (eq.equals("=")) {
                // n이 m보다 작거나 같을 경우 1, 아닐 경우 0
                answer = n <= m ? 1 : 0;
            // eq가 "!"일 경우
            } else if (eq.equals("!")) {
                // n이 m보다 작을 경우 1, 아닐 경우 0
                answer = n < m ? 1 : 0;
            }
        }

        return answer;
    }
}
