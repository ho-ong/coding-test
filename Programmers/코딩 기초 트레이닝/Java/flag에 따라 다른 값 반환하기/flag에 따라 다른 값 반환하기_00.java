class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag) {
            answer = a + b; // true
        } else {
            answer = a - b; // false
        }

        return answer;
    }
}
