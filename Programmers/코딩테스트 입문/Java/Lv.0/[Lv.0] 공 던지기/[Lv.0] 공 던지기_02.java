class Solution {
    public int solution(int[] numbers, int k) {
        // (2 - 1) * 2 % 4 + 1 = 3
        // (5 - 1) * 2 % 6 + 1 = 3
        // (3 - 1) * 2 % 3 + 1 = 2
        return (k - 1) * 2 % numbers.length + 1;
    }
}
