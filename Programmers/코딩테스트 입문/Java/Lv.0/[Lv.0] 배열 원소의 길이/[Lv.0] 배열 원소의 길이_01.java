import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        // 배열의 원소의 길이
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
