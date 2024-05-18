class Solution {
    public int solution(int num, int n) {
        // 배수: 어떤 수에 정수를 곱한 수 (어떤 수에 의해 나누어 떨어지는 수)
        // num을 n으로 나눴을 때, 나머지가 0일 경우 배수
        // 배수일 경우 1, 아닐 경우 0
        return num % n == 0 ? 1 : 0;
    }
}
