import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(
            // boxed(): 기본 타입 스트림을 클래스 타입 스트림으로 변환 (IntStream -> Stream<Integer>)
            // int 자체로는 Collection에 넣지 못하므로 Integer 클래스로 변환하여 사용
            // collect(): 스트림 원소를 List, Set, Map으로 변환
            // groupingBy(): 원소를 그룹화
            // entrySet(): Map의 전체 key-value를 반환
            // sorted(compare()): 비교 후 정렬
            Arrays.stream(array).boxed().collect(Collectors.groupingBy(i -> i)).entrySet())
            .stream().sorted((s0, s1) -> Integer.compare(s1.getValue().size(), s0.getValue().size()))
            .collect(Collectors.toList());

        // list의 크기가 1보다 크고, list의 1, 2번째 값의 차가 0일 경우 -1
        // 아닐 경우 list의 1번째 키 반환
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
    }
}
