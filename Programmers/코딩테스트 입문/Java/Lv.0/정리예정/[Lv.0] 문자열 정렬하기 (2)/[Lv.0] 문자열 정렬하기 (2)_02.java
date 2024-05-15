import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        // Locale.ROOT: 문자열 변환 시 사용자의 컴퓨터 환경과 상관없이 항상 동일한 방식으로 변환
        // 변환된 문자열이 항상 동일한 결과를 보장 (불필요한 오류 방지)
        return Arrays.stream(my_string.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
    }
}
