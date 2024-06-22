class Solution {
    public int solution(String my_string, String is_prefix) {
        // startsWith(): 문자열 접두사 확인
        // is_prefix가 접두사일 경우 1, 아닐 경우 0
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
