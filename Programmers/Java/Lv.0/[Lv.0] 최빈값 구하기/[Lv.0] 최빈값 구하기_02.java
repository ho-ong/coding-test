import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(
            // boxed() : 기본 타입 스트림을 클래스 타입 스트림으로 변환 (IntStream -> Stream<Integer>)
            // int 자체로는 Collection에 못 담기 때문에 Integer 클래스로 변환하여 사용
            // collect() : 스트림 원소를 List, Set, Map으로 변환
            // groupingBy() : 원소를 그룹화
            // entrySet() : Map의 전체 key-value를 반환
            // compare() : 비교를 통해 정렬 순서를 결정
            Arrays.stream(array).boxed().collect(Collectors.groupingBy(o -> o)).entrySet())
            .stream().sorted((t0, t1) -> Integer.compare(t1.getValue().size(), t0.getValue().size()))
            .collect(Collectors.toList());

        // list의 크기가 1보다 크고, list의 1, 2번째 값의 차가 0이면 -1
        // 아니면 list의 1번째 키 반환
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
    }
}
