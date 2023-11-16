class Solution {
    public int solution(int a, int b) {
        int add = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int multiply = 2 * a * b;

        if (add >= multiply) {
            return add;
        } else {
            return multiply;
        }
    }
}
