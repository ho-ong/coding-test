class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i += code) {
            // 문자열의 원소를 모두 합치기
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지의 문자열 반환
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }
}
