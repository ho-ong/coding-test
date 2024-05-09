class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0; // 모드

        for (int i = 0; i < code.length(); i++) {
            // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
            // 문자열 code 내 인덱스 i에 위치한 문자열을 문자로 변환

            // 문자열 code의 문자가 '1'일 경우
            if (code.charAt(i) == '1') {
                // mode(0 또는 1)를 바꾸기 (0 <-> 1)
                mode = 1 - mode;
            // i를 2로 나눴을 때, 나머지가 mode(0 또는 1)일 경우
            } else if (i % 2 == mode) {
                // 문자열 code의 문자를 합치기
                answer += code.charAt(i);
            }
        }

        // 문자열 answer가 빈 문자열일 경우 "EMPTY", 아닐 경우 문자열 answer
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
