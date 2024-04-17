class Solution {
    public int solution(int num1, int num2) {
        // 나눗셈 전 1000을 먼저 곱할 경우
        // 나눗셈의 결괏값 중 실수가 존재하지 않으므로 자료형 변환 X

        // 3 * 1000 / 2 = 1500
        return num1 * 1000 / num2;
    }
}
