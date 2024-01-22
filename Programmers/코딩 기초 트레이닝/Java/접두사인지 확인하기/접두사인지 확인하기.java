class Solution {
    public int solution(String my_string, String is_prefix) {
        // startsWith() : 문자열에서 특정 문자열로 시작하는지 확인
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
