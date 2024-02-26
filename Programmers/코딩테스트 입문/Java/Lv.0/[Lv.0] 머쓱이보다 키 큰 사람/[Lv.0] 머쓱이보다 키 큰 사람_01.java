import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        // array 배열의 원소가 height보다 클 경우의 개수 구하기
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
