import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // n의 순서쌍 = n의 약수
        // 나머지가 0일 경우 n의 약수, n의 약수의 개수 구하기
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
