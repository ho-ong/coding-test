import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i1 -> (int) IntStream.rangeClosed(1, i1).filter(i2 -> i1 % i2 == 0).count() > 2).count();
    }
}
