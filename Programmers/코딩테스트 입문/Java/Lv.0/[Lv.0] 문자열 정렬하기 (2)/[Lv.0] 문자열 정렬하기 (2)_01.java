import java.util.*;

class Solution {
    public String solution(String my_string) {
        // toCharArray(): String 문자열 -> char 배열 반환
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
