import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return n % 2 != 0 ? IntStream.iterate(1, i -> i <= n, i -> i + 2).sum() : (int) IntStream.iterate(2, i -> i <= n, i -> i + 2).mapToDouble(operand -> Math.pow(operand, 2)).sum();
    }
}
