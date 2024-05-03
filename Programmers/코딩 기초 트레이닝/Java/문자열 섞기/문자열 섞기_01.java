class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
            // 문자열 str1과 str2 내 인덱스 i에 위치한 문자열을 문자로 변환
            // 문자열 str1과 str2의 문자를 번갈아 가면서 합치기
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }
}
