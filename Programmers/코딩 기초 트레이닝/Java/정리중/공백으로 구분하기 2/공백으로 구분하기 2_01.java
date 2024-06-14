class Solution {
    public String[] solution(String my_string) {
        // trim(): 문자열의 양쪽 공백 제거
        // "\\s+": 1개 이상의 공백
        return my_string.trim().split("\\s+");
    }
}
