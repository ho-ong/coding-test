import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 인덱스 num1부터 num2까지 자른 원소 구하기
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
}
