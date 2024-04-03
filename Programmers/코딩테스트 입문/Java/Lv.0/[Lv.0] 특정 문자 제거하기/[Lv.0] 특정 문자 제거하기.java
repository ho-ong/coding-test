class Solution {
    public String solution(String my_string, String letter) {
        // replace(): 문자열을 다른 문자열로 치환
        // 문자열 my_string 내 문자열 letter를 ""으로 치환 (""으로 치환 시 제거와 동일)
        // "abcdef" -> "f"를 ""으로 치환 (제거) -> "abcde"
        return my_string.replace(letter, "");
    }
}
