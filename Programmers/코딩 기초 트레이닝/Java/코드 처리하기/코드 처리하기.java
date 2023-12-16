class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                // code의 문자가 '1'일 경우
                // 0 -> 1, 1 -> 0 변환
                mode = 1 - mode;
            } else if (i % 2 == mode) {
                // mode가 0 또는 1일 경우
                // code의 문자 추가
                answer += code.charAt(i);
            }
        }

        // 빈 문자열일 경우 "EMPTY" 반환, 아닐 경우 문자열 반환
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
