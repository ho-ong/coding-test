import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 기본형 스트림 생성 -> 원소 매핑 -> 배열 변환
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성
        // map(): 스트림 내 기존 원소를 새로운 원소로 매핑하여 반환

        // num1(포함)부터 num2(포함)까지 범위 내 정수를 순서대로 생성 (1, 2, 3)
        // numbers 배열의 원소 중 인덱스 1, 2, 3에 위치한 원소를 배열로 변환
        // numbers[1], numbers[2], numbers[3] -> 2, 3, 4 -> [2, 3, 4]
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
}
