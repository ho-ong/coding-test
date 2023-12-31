class Solution {
    public String solution(String my_string) {
        // replaceAll(regex, replacement) : replace()와 비슷하나, 첫 번째 인자가 정규식
        // 정규 표현식(Regular Expression)
        // [aeiou] : a, e, i, o, u (or 연산자)
        return my_string.replaceAll("[aeiou]", "");
    }
}
