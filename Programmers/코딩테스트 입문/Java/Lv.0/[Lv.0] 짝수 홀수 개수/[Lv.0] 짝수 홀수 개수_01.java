import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        // 기본형 스트림 생성 -> filter -> 개수 계산 -> 배열 변환
        // 기본형 스트림: IntStream, LongStream, DoubleStream (숫자 스트림을 효율적으로 처리)
        // of(): 가변 매개변수를 전달받아 스트림 생성
        // filter(): 스트림 내 원소 중 특정 조건에 해당하는 원소의 값만 추출하여 반환
        // count(): 개수 반환

        // i를 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
        // 짝수의 개수와 홀수의 개수를 추출하고, 배열로 변환
        // [1, 2, 3, 4, 5] -> 짝수 2, 4, 홀수 1, 3, 5 -> [2, 3]
        return IntStream.of(
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), // 짝수의 개수 2
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count() // 홀수의 개수 3
        ).toArray(); // [2, 3]
    }
}
