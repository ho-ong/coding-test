import java.util.*;

class Solution {
    public int solution(int order) {
        // order를 10으로 나눴을 때, 나머지가 3, 6, 9일 경우
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}
