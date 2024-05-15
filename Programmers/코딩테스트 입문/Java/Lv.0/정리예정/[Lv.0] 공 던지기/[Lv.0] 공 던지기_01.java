class Solution {
    public int solution(int[] numbers, int k) {
        // - 1 하는 이유?
        // 1부터 시작하므로 - 1을 해야 한다. (시작 1은 제외)
        return numbers[(k - 1) * 2 % numbers.length];
    }
}
