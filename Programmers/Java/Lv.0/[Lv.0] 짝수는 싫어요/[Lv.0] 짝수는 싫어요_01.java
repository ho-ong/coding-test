import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        // IntStream.rangeClosed(start, end) : 범위 내 정수를 순차적으로 생성
        // 배열의 홀수 원소 구하기 (2로 나누면, 나머지가 1)
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
