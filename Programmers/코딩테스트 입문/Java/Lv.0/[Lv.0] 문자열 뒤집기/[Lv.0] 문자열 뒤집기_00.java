class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 마지막 원소부터 역순으로 문자열에 넣기 (문자열의 길이 - 1)
        for (int i = my_string.length() - 1; i >= 0; i--) {
            // 문자열의 원소를 모두 합치기
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
