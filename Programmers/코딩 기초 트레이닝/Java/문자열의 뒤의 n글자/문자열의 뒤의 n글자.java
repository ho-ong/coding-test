class Solution {
    public String solution(String my_string, int n) {
        // substring(index) : index(포함)부터 모든 문자열 반환
        return my_string.substring(my_string.length() - n);
    }
}
