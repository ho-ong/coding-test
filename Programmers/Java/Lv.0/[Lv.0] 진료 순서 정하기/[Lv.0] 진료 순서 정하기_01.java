import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] e) {
        // Comparator.reverseOrder() : 내림차순 정렬
        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}
