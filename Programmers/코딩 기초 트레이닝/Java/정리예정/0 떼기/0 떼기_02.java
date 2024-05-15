class Solution {
    public String solution(String n_str) {
        // 정규 표현식(Regular Expression)
        // /^0+/: 맨 앞부터 1개 이상의 0 찾기
        return n_str.replace(/^0+/, "");
    }
}
