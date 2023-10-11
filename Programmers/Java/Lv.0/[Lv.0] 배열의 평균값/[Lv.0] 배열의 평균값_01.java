import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        // average() : 원소 평균 반환
        // orElse(0) : 값이 없을 경우 기본값 지정
        return Arrays.stream(numbers).average().orElse(0);
    }
}
