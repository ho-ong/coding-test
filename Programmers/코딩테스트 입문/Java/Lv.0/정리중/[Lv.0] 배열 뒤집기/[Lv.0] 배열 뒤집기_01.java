import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열 -> 리스트
        // 배열 스트림 생성 -> boxed -> 문자열 병합 -> 리스트 변환
        // boxed(): 기본형 스트림을 스트림으로 변환 (IntStream -> Stream<Integer>)
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합

        // list 생성
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        // boxed() 하는 이유?
        // List, Set 등의 Collection 인터페이스에는 객체만 저장이 가능하므로
        // int를 Integer 클래스로 변환하여 List<Integer>에 넣는다. (int -> Integer)

        // reverse(): 반전 반환
        Collections.reverse(list);

        // 리스트 -> 배열
        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return list.stream().mapToInt(Integer::intValue).toArray();

        // return list.stream().mapToInt(i -> i).toArray();
    }
}
