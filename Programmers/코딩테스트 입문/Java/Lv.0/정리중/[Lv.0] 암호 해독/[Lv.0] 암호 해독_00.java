class Solution {
    public String solution(String cipher, int code) {
        String answer = ""; // 해독된 암호

        for (int i = code - 1; i < cipher.length(); i += code) {
            // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
            answer += cipher.charAt(i);
        }

        return answer;
    }
}
