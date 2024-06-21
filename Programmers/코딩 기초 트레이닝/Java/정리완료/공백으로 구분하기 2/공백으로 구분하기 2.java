class Solution {
    public String[] solution(String my_string) {
        // trim(): 문자열 공백 제거 (양쪽)
        // split(): 문자열 분리
        // "[ ]+": 1개 이상의 공백
        return my_string.trim().split("[ ]+");

        // "\\s+": 1개 이상의 공백
        // return my_string.trim().split("\\s+");
    }
}
