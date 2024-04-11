import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열 -> 리스트
        // 배열 스트림 생성 -> boxed -> collect -> 리스트 변환
        // boxed(): 기본형 스트림을 스트림으로 변환 (IntStream -> Stream<Integer>)
        // collect(): 스트림 내 원소를 변형 및 처리, List, Set 등의 자료형으로 변환
        // collect(Collectors.toList()): 스트림 내 원소를 리스트로 변환

        // list 생성
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        // boxed() 하는 이유?
        // List, Set 등의 Collection 인터페이스에는 객체만 저장이 가능하기 때문에,
        // int를 Integer 클래스로 변환하여 List<Integer>에 넣는다. (int -> Integer)

        // reverse(): 반전 반환
        // [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
        Collections.reverse(list);

        // 리스트 -> 배열
        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return list.stream().mapToInt(Integer::intValue).toArray(); // 방법 1

        // return list.stream().mapToInt(i -> i).toArray(); // 방법 2
    }
}
