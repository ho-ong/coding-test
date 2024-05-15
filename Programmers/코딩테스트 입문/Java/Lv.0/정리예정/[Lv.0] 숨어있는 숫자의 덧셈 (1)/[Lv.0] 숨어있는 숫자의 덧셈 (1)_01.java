class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (첫 번째 매개변수는 정규식)
        // 문자열 my_string 내 0부터 9까지를 제외한 문자열을 ""으로 치환 (""으로 치환 시 제거와 동일)

        // 정규표현식(Regular Expression)
        // ^0: 0부터 시작 (문자열의 시작을 의미, [] 안에 있을 경우 0이 아니라는 부정의 의미)
        // [^0-9]: 0부터 9까지 제외
        String s = my_string.replaceAll("[^0-9]", "");

        // toCharArray(): 문자열을 char형 문자로 분리하고, char[] 배열에 순서대로 저장
        // 문자열 s를 char형 문자로 분리하고, char[] 배열에 순서대로 저장 -> 문자 c로 변환
        for (char c : s.toCharArray()) {
            // Character.getNumericValue(): 숫자 형태의 char형 문자를 int형 정수로 변환 (char -> int)
            // 문자 c를 정수로 변환하여 더하기
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}
