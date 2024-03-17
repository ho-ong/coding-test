import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        // 배열 스트림 생성 -> 평균 계산 -> 값이 없을 경우 default 값 반환

        // average(): 평균 반환
        // orElse(): 값이 없을 경우 default 값 반환 (() 안에 default 값 지정)
        return Arrays.stream(numbers).average().orElse(0);
    }
}
