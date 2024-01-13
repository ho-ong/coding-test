import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        // 배열의 마지막 원소, 그전 요소를 곱하기 (큰 값끼리 곱하기)
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
