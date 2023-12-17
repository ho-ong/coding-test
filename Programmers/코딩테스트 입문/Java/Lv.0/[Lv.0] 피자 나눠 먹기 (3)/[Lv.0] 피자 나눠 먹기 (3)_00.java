class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        // n을 slice로 나누기 (피자 slice조각)
        // 나머지가 있을 경우 + 1 (최소 피자 1판 필요)
        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }

        return answer;
    }
}
