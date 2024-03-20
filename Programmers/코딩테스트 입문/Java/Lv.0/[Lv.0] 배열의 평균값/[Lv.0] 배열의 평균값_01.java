import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        // 배열 스트림 생성 -> 평균 계산 -> 값이 없을 경우 0 반환
        // average(): 평균 반환
        // orElse(): 값이 없을 경우 default 값 반환

        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] -> 55
        // 55 / 10 = 5.5
        return Arrays.stream(numbers).average().orElse(0);
    }
}
