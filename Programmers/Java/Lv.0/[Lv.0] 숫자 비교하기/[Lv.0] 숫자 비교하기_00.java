class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;

        if (num1 == num2) {
            // num1과 num2가 같으면 1
            answer = 1;
        } else {
            // num1과 num2가 다르면 -1
            answer = -1;
        }

        return answer;
    }
}
