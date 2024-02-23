import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // 나머지가 0일 경우 n의 배수
        return Arrays.stream(numList).filter(i -> i % n == 0).toArray();
    }
}
