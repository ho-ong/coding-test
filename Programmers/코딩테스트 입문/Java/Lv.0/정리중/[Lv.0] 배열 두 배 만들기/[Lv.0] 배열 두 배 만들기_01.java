import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 배열 스트림 생성 -> 원소 매핑 -> 배열 변환
        // map(): 스트림 내 기존 원소를 새로운 원소로 매핑하여 반환
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
