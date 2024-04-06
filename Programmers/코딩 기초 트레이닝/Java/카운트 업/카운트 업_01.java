import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        // 기본형 스트림 생성 -> 배열 변환
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성

        // start_num(포함)부터 end_num(포함)까지 범위 내 정수를 순서대로 생성 (3, 4, 5, ..., 8, 9, 10)
        // 3, 4, 5, 6, 7, 8, 9, 10 -> [3, 4, 5, 6, 7, 8, 9, 10]
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
