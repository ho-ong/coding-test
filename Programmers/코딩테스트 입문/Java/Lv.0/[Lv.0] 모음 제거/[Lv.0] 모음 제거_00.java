class Solution {
    public String solution(String my_string) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (첫 번째 매개변수는 정규식)
        // 문자열 my_string 내 문자열 a, e, i, o, u를 ""으로 치환 (""으로 치환 시 제거와 동일)

        // 정규표현식(Regular Expression)
        // [ab]: a 또는 b (or)
        // [aeiou]: a, e, i, o, u (or)

        // "bus" -> "[aeiou]"를 ""으로 치환 (제거) -> "bs"
        return my_string.replaceAll("[aeiou]", "");
    }
}
