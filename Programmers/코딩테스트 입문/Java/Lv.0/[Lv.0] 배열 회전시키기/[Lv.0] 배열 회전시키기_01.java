import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 배열 -> 리스트
        // 배열 스트림 생성 -> boxed -> 문자열 병합 -> 리스트 변환
        // boxed(): 기본형 스트림을 스트림으로 변환 (IntStream -> Stream<Integer>)
        // collect(): 스트림 내 원소를 변형 및 처리, List, Set 등의 자료형으로 변환
        // collect(Collectors.toList()): 스트림 내 원소를 리스트로 변환

        // list 생성
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        // boxed() 하는 이유?
        // List, Set 등의 Collection 인터페이스에는 객체만 저장이 가능하므로
        // int를 Integer 클래스로 변환하여 List<Integer>에 넣는다. (int -> Integer)

        // direction이 "right"일 경우
        if (direction.equals("right")) {
            // list에 원소 추가
            // [1, 2, 3] -> [3, 1, 2, 3]
            list.add(0, list.get(list.size() - 1));

            // list의 원소 제거
            // [3, 1, 2, 3] -> [3, 1, 2]
            list.remove(list.size() - 1);
        // direction이 "left"일 경우
        } else {
            // list에 원소 추가
            // [1, 2, 3] -> [1, 2, 3, 1]
            list.add(list.size(), list.get(0));

            // list의 원소 제거
            // [1, 2, 3, 1] -> [2, 3, 1]
            list.remove(0);
        }

        // 리스트 -> 배열
        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
