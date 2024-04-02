import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        // 기본형 스트림 생성 -> filter -> 배열 변환
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성
        // filter(): 스트림 내 원소 중 특정 조건에 해당하는 원소의 값만 추출하여 반환

        // 0(포함)부터 n(포함)까지 범위 내 정수를 순서대로 생성 (0, 1, 2, ..., 8, 9, 10)
        // i를 2로 나눴을 때, 나머지가 1일 경우 홀수
        // 홀수인 원소를 추출하고, 배열로 변환
        // 1, 3, 5, 7, 9 -> [1, 3, 5, 7, 9]
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 1).toArray();
    }
}
