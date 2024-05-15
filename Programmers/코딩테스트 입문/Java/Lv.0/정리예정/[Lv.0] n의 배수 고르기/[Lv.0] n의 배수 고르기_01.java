import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // i를 n으로 나눴을 때, 나머지가 0일 경우 n의 배수
        return Arrays.stream(numList).filter(i -> i % n == 0).toArray();
    }
}
