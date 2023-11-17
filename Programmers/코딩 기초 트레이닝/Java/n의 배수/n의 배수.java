class Solution {
    public int solution(int num, int n) {
        // 나머지가 0이면 배수
        return num % n == 0 ? 1 : 0;
    }
}
