class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">")) {
            // ">"일 경우
            if (eq.equals("=")) {
                answer = n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                answer = n > m ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            // "<"일 경우
            if (eq.equals("=")) {
                answer = n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                answer = n < m ? 1 : 0;
            }
        }

        return answer;
    }
}
