class Solution {
    public String solution(String my_string) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        // a, e, i, o, u를 ""으로 치환 => ""으로 치환할 경우 문자열 제거

        // 방법 1
        // [aeiou]: a, e, i, o, u (or)
        return my_string.replaceAll("[aeiou]", "");

        // 방법 2
        // a|e|i|o|u: a, e, i, o, u (or)
        // return my_string.replaceAll("a|e|i|o|u", "");
    }
}
