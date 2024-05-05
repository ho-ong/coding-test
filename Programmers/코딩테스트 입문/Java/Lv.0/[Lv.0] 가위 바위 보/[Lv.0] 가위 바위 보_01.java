import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        // 배열 스트림 생성 -> 원소 매핑 -> 문자열 병합

        // map(): 스트림 내 기존 원소를 새로운 원소로 매핑하여 반환
        // collect(): 스트림 내 원소를 변형 및 처리, List, Set 등의 자료형으로 변환
        // collect(Collectors.joining()): 스트림 내 문자열 병합

        // split(): 문자열 분리
        // 문자열 rsp를 "" 기준으로 분리하고, 배열에 순서대로 저장

        // i가 "2"일 경우 "0", "0"일 경우 "5", 아닐 경우 "2"
        return Arrays.stream(rsp.split("")).map(i -> i.equals("2") ? "0" : i.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
