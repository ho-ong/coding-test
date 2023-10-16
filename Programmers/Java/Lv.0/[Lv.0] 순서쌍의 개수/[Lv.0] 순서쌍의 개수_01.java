import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // n의 약수 구하기 (나머지가 0이면 n의 약수)
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
