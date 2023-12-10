import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        // included의 원소가 true일 경우, 등차수열 더하기
        return IntStream.range(0, included.length).map(i -> included[i] ? a + (i * d) : 0).sum();
    }
}
