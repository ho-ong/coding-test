import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // copyOfRange(array, start, end) : 배열의 특정 범위만큼 원소들을 복사하여 새로운 배열로 반환
        // 복사할 원본 배열, 복사를 시작할 인덱스, 복사를 끝낼 인덱스
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
