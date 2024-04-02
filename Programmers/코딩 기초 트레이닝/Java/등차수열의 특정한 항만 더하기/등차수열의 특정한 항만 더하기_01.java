import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        // 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
        // 공차: 등차수열이나 등차급수에서 서로 이웃하는 두 항의 차

        // 기본형 스트림 생성 -> map -> 합계 계산
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수를 순서대로 생성
        // map(): 스트림 내 기존 원소를 새로운 원소로 매핑하여 반환
        // sum(): 합계 반환

        // 0(포함)부터 included 배열의 길이(불포함)까지 범위 내 정수를 순서대로 생성 (0, 1, 2, 3, 4)
        // included 배열의 원소가 true일 경우 등차수열의 합계 구하기
        // 공차가 d이므로 d에 i를 곱하기 (3 + 0, 3 + 4, 3 + 8, ...)
        // 3 + 15 + 19 = 37
        return IntStream.range(0, included.length).map(i -> included[i] ? a + (d * i) : 0).sum();
    }
}
