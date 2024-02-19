import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        // Collections.swap(list, num1, num2): 목록 내 해당 인덱스에 위치한 두 원소를 교환
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
