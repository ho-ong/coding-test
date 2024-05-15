import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        // 배열 스트림 생성 -> 중복 제거 -> 문자열 병합
        // distinct(): 중복 제거
        // collect(): 스트림 내 원소를 변형 및 처리, List, Set 등의 자료형으로 변환
        // collect(Collectors.joining()): 스트림 내 문자열 병합

        // split(): 문자열 분리
        // 문자열 my_string을 "" 기준으로 분리하고, 배열에 순서대로 저장

        // 중복을 제거하여 합치기
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}
