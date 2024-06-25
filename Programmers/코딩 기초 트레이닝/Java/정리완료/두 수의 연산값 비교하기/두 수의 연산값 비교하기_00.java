class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수 변환
        // String.valueOf(): 문자열 변환
        int sum = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int mul = 2 * a * b;

        // sum이 mul보다 크거나 같을 경우 sum, 아닐 경우 mul
        if (sum >= mul) {
            return sum;
        } else {
            return mul;
        }
    }
}
