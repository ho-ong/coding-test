import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // [A-Z|a-z] : A부터 Z까지 or a부터 z까지
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
