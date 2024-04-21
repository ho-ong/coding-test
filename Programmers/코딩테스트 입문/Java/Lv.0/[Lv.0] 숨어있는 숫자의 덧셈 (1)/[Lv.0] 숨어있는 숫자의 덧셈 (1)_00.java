class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (첫 번째 매개변수는 정규식)
        // 문자열 my_string 내 문자열 a부터 z까지 또는 A부터 Z까지를 ""으로 치환 (""으로 치환 시 제거와 동일)

        // 정규표현식(Regular Expression)
        // [a-z|A-Z]: a부터 z까지 또는 A부터 Z까지 (or)

        // "aAb1B2cC34oOp" -> "[a-z|A-Z]"를 ""으로 치환 (제거) -> "1234"
        String s = my_string.replaceAll("[a-z|A-Z]", "");

        // split(): 문자열 분리
        // 문자열 s를 "" 기준으로 분리하고, str 배열에 순서대로 저장
        // "1234" -> ["1", "2", "3", "4"]
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            // Integer.parseInt(): 정수로 변환
            // str 배열의 원소를 정수로 변환하여 더하기
            // ["1", "2", "3", "4"] -> [1, 2, 3, 4]
            // 1 + 2 + 3 + 4 = 10
            answer += Integer.valueOf(str[i]);
        }

        return answer;
    }
}
