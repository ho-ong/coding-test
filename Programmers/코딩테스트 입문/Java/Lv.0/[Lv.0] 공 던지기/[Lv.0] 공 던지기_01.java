import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers, int k) {
        // flatMap(): 기본적인 형태의 flatMap 메서드 (일반 스트림, 기본형 특화 스트림 모두에서 제공)
        // flatMapToInt(): 일반 스트림을 IntStream으로 변환 (일반 스트림에서만 제공)
        // flatMapToInt, flatMapToLong, flatMapToDouble
        return IntStream.range(1, k).mapToObj(i -> numbers).flatMapToInt(IntStream::of).toArray()[2 * k - 2];
    }
}
