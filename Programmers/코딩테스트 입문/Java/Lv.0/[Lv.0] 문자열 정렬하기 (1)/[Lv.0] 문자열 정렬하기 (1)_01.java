import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // 배열 스트림 생성 -> 오름차순 정렬 -> mapToInt -> 배열 변환

        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (첫 번째 매개변수는 정규식)
        // 문자열 my_string 내 문자열 a부터 z까지를 ""으로 치환 (""으로 치환 시 제거와 동일)

        // 정규표현식(Regular Expression)
        // [a-z]: a부터 z까지

        // split(): 문자열 분리
        // 문자열 my_string을 "" 기준으로 분리하고, 배열에 순서대로 저장

        // sorted(): 오름차순 정렬
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return Arrays.stream(my_string.replaceAll("[a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
