class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            // substring(): 문자열 자르기
            // 문자열 str1과 str2를 1개씩 자르고, 번갈아 가면서 합치기
            // "a" + "b" + ... -> "ababababab"
            answer += str1.substring(i, i + 1);
            answer += str2.substring(i, i + 1);
        }

        return answer;
    }
}
