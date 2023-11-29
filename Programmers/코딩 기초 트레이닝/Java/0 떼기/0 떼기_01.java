class Solution {
    public String solution(String n_str) {
        // Number() : 문자열 -> 정수
        // 정수 앞에 0 위치 X (0010 -> 10)
        return String(Number(n_str));
    }
}
