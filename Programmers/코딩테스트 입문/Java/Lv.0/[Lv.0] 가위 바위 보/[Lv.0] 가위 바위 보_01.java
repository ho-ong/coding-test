import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        // 2 -> 0, 0 -> 5 or 2
        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
