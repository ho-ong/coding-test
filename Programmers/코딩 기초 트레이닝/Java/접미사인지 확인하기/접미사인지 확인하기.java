class Solution {
    public int solution(String my_string, String is_suffix) {
        // endsWith() : 문자열에서 특정 문자열로 끝나는지 확인
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
