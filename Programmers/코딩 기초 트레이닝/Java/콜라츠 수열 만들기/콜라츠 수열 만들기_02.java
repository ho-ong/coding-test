import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n) {
        // 스트림 생성 -> iterate -> mapToInt -> 배열 변환
        // iterate(): 연산을 반복 수행
        // List, Set 등의 컬렉션을 반복하는 데 사용할 수 있는 객체
        // for, while 같은 반복문을 함수형 프로그래밍 방식으로 작성
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)

        return Stream.iterate(
            // i >= 1
            // i가 1일 경우 0, 아닐 경우
            // i를 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
            // 짝수일 경우 i / 2, 홀수일 경우 i * 3 + 1
            n, i -> i >= 1, i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : i * 3 + 1
        ).mapToInt(i -> i).toArray();
    }
}
