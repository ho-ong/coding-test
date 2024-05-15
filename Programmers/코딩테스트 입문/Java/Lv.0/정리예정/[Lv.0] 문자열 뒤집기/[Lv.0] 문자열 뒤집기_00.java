class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 문자열 my_string의 마지막 문자열부터 첫 번째 문자열까지 역순으로 넣기
        // 문자열의 마지막 문자열 = 문자열의 길이 - 1
        for (int i = my_string.length() - 1; i >= 0; i--) {
            // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
            // 문자열 my_string 내 인덱스 i에 위치한 문자열을 문자로 변환

            // 문자열 my_string의 문자를 합치기
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
