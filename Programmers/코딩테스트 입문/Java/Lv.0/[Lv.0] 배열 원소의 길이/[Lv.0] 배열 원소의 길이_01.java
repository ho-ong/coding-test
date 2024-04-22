import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        // 배열 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        // mapToInt(String::length): 문자열의 길이 반환

        // strlist 배열의 원소의 길이를 배열로 변환
        // ["We", "are", "the", "world!"] -> [2, 3, 3, 6]
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
