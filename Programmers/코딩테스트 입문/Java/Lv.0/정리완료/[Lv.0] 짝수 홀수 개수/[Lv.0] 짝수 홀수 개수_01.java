import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        // 기본형 스트림 생성 -> 원소 추출 -> 개수 계산 -> 배열 변환
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // of(): 가변 매개변수를 전달받아 스트림 생성
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // count(): 개수 반환
        // toArray(): 배열 변환
        return IntStream.of(
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), // 짝수 개수
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count() // 홀수 개수
        ).toArray();
    }
}
