import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        // mapToObj() : Stream으로 변환
        // joining() : 문자열 연결
        // + 49 : 아스키 코드 변환
        // char 문자 변환
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}
