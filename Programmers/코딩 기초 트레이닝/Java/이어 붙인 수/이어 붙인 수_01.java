import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        // 짝수, 홀수를 이어 붙이고, 짝수와 홀수를 더하기
        return Integer.parseInt(Arrays.stream(num_list).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(num_list).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));
    }
}
