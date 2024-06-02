class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        // 왼쪽으로 1비트 옮긴 값 = 2로 곱한 값
        answer = n << t;
        return answer;
    }
}
