import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 짝수 구하기 (짝수는 2로 나눌 경우 나머지 0)
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }
}
