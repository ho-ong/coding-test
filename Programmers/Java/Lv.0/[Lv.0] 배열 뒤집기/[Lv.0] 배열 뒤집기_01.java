import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // reverse() : 원소 반전 반환
        // mapToInt() : 스트림을 IntStream으로 변환
        // 기본 타입(Primitive Type) 스트림을 사용
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
