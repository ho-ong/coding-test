import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        // average(): 원소의 평균 반환
        // orElse(): 값이 없을 경우 default 값을 반환 (() 안에 default 값을 지정)
        return Arrays.stream(numbers).average().orElse(0);
    }
}
