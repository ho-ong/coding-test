import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            // direction이 "right"일 경우
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            // direction이 "left"일 경우
            list.add(list.size(), list.get(0));
            list.remove(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
