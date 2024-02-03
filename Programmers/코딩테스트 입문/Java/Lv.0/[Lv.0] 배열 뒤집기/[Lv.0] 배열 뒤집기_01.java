import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // reverse(): 원소의 반전 반환
        // mapToInt(): IntStream으로 변환
        // 기본 타입(Primitive Type) 스트림: IntStream, LongStream, DoubleStream
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
