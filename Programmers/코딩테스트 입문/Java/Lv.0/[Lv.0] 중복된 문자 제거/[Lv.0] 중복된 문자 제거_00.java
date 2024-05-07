class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            // contains(): 문자열 포함 여부 확인
            // String.valueOf(): 문자열로 변환

            // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
            // 문자열 my_string 내 인덱스 i에 위치한 문자열을 문자로 변환

            // 문자열 answer 내 문자열 my_string의 문자가 포함되지 않을 경우
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                // 문자열 my_string의 문자를 합치기
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
