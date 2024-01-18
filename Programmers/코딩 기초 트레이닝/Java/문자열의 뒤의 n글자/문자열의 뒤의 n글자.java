class Solution {
    public String solution(String my_string, int n) {
        // substring(startIndex, endIndex) : startIndex(포함)부터 endIndex(불포함)까지의 문자열 반환
        return my_string.substring(my_string.length() - n);
    }
}
