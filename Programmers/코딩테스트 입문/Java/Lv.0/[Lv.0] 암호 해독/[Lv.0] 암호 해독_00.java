class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code - 1; i < cipher.length(); i += code) {
            // 문자열의 원소를 모두 합치기
            answer += cipher.charAt(i);
        }

        return answer;
    }
}
