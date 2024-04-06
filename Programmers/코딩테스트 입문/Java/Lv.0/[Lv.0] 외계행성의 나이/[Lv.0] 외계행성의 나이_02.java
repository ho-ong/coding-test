import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        // 스트림 변환 -> mapToObj -> collect
        // String.valueOf(): 문자열로 변환
        // chars(): 문자열의 문자들을 스트림으로 변환
        // mapToObj(): 기본형 스트림을 스트림으로 변환 (IntStream, ... -> Stream<T>)
        // collect(): 스트림 내 원소를 변형 및 처리, List, Set 등의 자료형으로 변환
        // collect(Collectors.joining()): 스트림 내 문자열 병합

        // ASCII 코드 변환 (0-9 = 48-57, A-Z = 65-90, a-z = 97-122)
        // 정수 -> 문자 변환 (char), 문자 -> 정수 변환 (int)

        // "23" -> '2', '3' -> 2, 3 -> 'c', 'd' -> "cd"
        return String.valueOf(age).chars().mapToObj(i -> String.valueOf((char) (i + 49))).collect(Collectors.joining());
    }
}
