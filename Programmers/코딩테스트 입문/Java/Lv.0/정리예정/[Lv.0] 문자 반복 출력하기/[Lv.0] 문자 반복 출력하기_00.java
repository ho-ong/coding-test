class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        // split(): 문자열 분리
        // 문자열 my_string을 "" 기준으로 분리하고, str 배열에 순서대로 저장
        String[] str = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            // str 배열의 원소를 n번 반복하여 합치기
            answer += str[i].repeat(n);
        }

        return answer;
    }
}
