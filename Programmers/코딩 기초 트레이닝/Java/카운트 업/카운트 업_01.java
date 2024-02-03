import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        // IntStream.rangeClosed(start, end): 범위 내 정수를 순서대로 생성
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
