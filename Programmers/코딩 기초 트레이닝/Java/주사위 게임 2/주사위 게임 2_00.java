class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && a != c && b != c) {
            // 세 숫자가 모두 다른 경우
            answer = a + b + c;
        } else if (a == b && a == c) {
            // 세 숫자가 모두 같은 경우
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            // 두 숫자는 같고, 나머지 숫자가 다른 경우
            answer = (a + b + c) * (a * a + b * b + c * c);
        }

        return answer;
    }
}
