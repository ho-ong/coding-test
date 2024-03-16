class Solution {
    public int solution(int number, int n, int m) {
        // 공배수: 두 개 이상의 자연수의 공통 배수
        // number를 n과 m으로 나눴을 때, 나머지가 0일 경우 공배수
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
