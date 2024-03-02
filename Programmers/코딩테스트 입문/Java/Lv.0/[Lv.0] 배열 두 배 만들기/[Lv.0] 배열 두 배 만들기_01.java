import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 배열 스트림 생성 -> map -> 배열 변환
        // stream().map(): 스트림 내 원소들을 하나씩 특정 값으로 변환

        // numbers 배열의 원소에 2를 곱하기
        // [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
