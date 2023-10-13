import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 홀수 구하기 (홀수는 2로 나눌 경우, 나머지가 1)
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 0).sum();
    }
}
