import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        Sreturn Integer.parseInt(Arrays.stream(num_list).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(num_list).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));
    }
}
