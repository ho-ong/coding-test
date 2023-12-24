import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        // 2 -> 0, 0 -> 5 or 2
        return Arrays.stream(rsp.split("")).map(i -> i.equals("2") ? "0" : i.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
