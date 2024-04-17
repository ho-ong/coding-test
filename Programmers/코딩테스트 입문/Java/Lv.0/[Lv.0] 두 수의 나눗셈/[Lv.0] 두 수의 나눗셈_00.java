class Solution {
    public int solution(int num1, int num2) {
        // 나눗셈의 결괏값 중 실수가 존재하므로 double형 실수로 변환
        // 최종적으로 정수를 반환하므로 int형 정수로 변환

        // 3 / 2 = 1.5
        // 1.5 * 1000 = 1500
        return (int) ((double) num1 / num2 * 1000);
    }
}
