import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // copyOfRange(array, startIndex, endIndex)
        // startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열의 원소를 복사하여 새로운 배열 반환
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
