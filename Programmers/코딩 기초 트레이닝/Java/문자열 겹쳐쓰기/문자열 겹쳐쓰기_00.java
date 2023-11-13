class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 기본 문자열 + 겹쳐 쓸 문자열 + 나머지 문자열 (my_string + overwrite_string + my_string)
        // substr(), substring() : 문자열 자르기
        String answer = my_string.substring(0, s) + overwrite_string;

        if (my_string.length() > overwrite_string.length()) {
            // 나머지 문자열을 모두 합치기
            answer += my_string.substring(answer.length());
        }

        return answer;
    }
}
