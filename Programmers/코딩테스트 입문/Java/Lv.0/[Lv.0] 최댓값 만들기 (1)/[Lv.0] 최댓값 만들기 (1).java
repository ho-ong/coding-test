import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // numbers 배열 오름차순 정렬
        // [1, 2, 3, 4, 5]
        Arrays.sort(numbers);

        // numbers 배열의 마지막 원소와 그전 원소를 곱하기
        // [1, 2, 3, 4, 5] -> 5, 4
        // 5 * 4 = 20
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
