class Solution {
    public int solution(int number, int n, int m) {
        // 공배수 : 두 개 이상의 자연수의 공통인 배수
        // 둘 다 나머지가 0이면 공배수
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
