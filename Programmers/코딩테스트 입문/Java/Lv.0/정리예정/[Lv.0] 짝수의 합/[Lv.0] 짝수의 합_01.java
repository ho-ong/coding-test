import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 기본형 스트림 생성 -> 원소 추출 -> 합계 계산
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성
        // filter(): 스트림 내 원소 중 특정 조건에 해당하는 원소의 값만 추출하여 반환
        // sum(): 합계 반환

        // 0(포함)부터 n(포함)까지 범위 내 정수를 순서대로 생성
        // i를 2로 나눴을 때, 나머지가 0일 경우 짝수
        // 짝수의 합계를 구하기
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }
}
