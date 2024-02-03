import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        // Comparator.reverseOrder(): 내림차순 정렬
        return Arrays.stream(emergency).map(i -> Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}
