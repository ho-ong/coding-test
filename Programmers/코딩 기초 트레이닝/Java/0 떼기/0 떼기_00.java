class Solution {
    public String solution(String n_str) {
        // Integer.parseInt(): 문자열 -> 정수
        // 정수 앞에 0 위치 X (0010 -> 10)
        return String(Integer.parseInt(n_str));
    }
}
