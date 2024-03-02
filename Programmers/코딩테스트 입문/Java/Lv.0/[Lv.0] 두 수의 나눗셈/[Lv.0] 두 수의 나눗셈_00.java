class Solution {
    public int solution(int num1, int num2) {
        // 나눗셈의 결괏값 중 실수가 존재하므로 double형으로 변환
        // 최종적으로 정수를 반환하므로 int형으로 변환
        return (int) ((double) num1 / num2 * 1000);
    }
}
