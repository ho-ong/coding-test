import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        // 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
        // 공차: 등차수열이나 등차급수에서 서로 이웃하는 두 항의 차

        // 기본형 스트림 생성 -> 원소 매핑 -> 합계 계산
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수를 순서대로 생성
        // map(): 다른 형태의 원소로 매핑하여 반환
        // sum(): 합계 반환

        // 등차수열 구하기
        // 배열의 원소가 true일 경우
        return IntStream.range(0, included.length).map(i -> included[i] ? a + (d * i) : 0).sum();
    }
}
