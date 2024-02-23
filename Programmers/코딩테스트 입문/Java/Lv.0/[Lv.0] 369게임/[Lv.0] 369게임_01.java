import java.util.*;

class Solution {
    public int solution(int order) {
        // 나머지가 3, 6, 9일 경우의 개수
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}
