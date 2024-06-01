import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        // 기본형 스트림 생성 -> 원소 매핑 -> 배열 변환
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성
        // map(): 다른 형태의 원소로 매핑하여 반환
        // toArray(): 배열 변환
        return IntStream.rangeClosed(-start, -end_num).map(i -> -i).toArray();
    }
}
