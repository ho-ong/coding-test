import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(
            // Collectors.groupingBy() : 배열의 원소를 그룹화
            // entrySet() : Map의 key-value 집합 반환
            Arrays.stream(array).boxed().collect(Collectors.groupingBy(o -> o)).entrySet())
            // 리스트 -> 스트림 변환
            // Integer.compare() : 정렬 순서 결정
            .stream().sorted((t0, t1) -> Integer.compare(t1.getValue().size(), t0.getValue().size()))
            // 스트림 -> 리스트 변환
            .collect(Collectors.toList());

        // list의 크기가 1보다 크고, list의 1, 2번째 값의 차가 0이면 -1
        // 아니면 list의 1번째 키 반환
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
    }
}
