import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n) {
        // Stream.iterate(): 연산을 반복 수행
        // for, while 같은 반복문을 함수형 프로그래밍 방식으로 작성
        return Stream.iterate(n, i -> i >= 1, i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : i * 3 + 1).mapToInt(Integer::intValue).toArray();
    }
}
