import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 배열의 원소에 2를 곱하기
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
