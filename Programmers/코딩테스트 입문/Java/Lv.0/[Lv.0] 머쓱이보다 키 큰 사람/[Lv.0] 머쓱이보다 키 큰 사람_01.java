import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        // height보다 클 경우의 개수
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
