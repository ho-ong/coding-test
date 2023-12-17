import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.of(
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), // 짝수
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count() // 홀수
        ).toArray();
    }
}
