class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // eq가 "="일 경우, "!"일 경우
        return eq.equals("=") ? ineq.equals("<") ? n <= m ? 1 : 0 : n >= m ? 1 : 0 : ineq.equals("<") ? n < m ? 1 : 0 : n > m ? 1 : 0;
    }
}
