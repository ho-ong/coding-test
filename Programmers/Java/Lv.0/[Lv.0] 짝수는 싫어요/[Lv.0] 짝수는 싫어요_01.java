import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        // IntStream.rangeClosed(start, end) : 특정 범위의 숫자를 순차적으로 생성
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
