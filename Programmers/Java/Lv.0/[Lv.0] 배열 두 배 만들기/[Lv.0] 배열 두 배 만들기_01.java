import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        // 배열의 i번째 원소의 값을 두 배로 만들기
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
