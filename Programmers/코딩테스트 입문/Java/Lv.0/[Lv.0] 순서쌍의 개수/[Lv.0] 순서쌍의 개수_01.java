import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 기본형 스트림 생성 -> filter -> 개수 계산
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성
        // filter(): 스트림 내 원소 중 특정 조건에 해당하는 원소의 값만 추출하여 반환
        // count(): 개수 반환

        // 1(포함)부터 n(포함)까지 범위 내 정수를 순서대로 생성 (1, 2, 3, ..., 18, 19, 20)
        // n의 순서쌍 = n의 약수
        // n을 i로 나눴을 때, 나머지가 0일 경우 n의 약수
        // n의 약수의 개수를 구하기
        // 1, 2, 4, 5, 10, 20
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count(); // 6
    }
}
