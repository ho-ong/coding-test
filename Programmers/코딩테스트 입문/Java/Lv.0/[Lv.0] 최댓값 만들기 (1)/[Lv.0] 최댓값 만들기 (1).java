import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순 정렬 [1, 2, 3, 4, 5]

        // numbers 배열의 마지막 원소, 그전 원소를 곱하기 (큰 값끼리 곱하기)
        // 5 * 4 = 20
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
