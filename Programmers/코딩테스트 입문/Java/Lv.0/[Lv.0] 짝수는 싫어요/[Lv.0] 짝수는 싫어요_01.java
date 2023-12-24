import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        // IntStream.rangeClosed(start, end) : 범위 내 정수를 순서대로 생성
        // 배열의 홀수 원소 구하기 (홀수는 2로 나눌 경우 나머지 1)
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 1).toArray();
    }
}
