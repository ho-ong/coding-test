class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            // 문자열을 1개씩 자른 후 번갈아 가며 합치기
            answer += str1.substring(i, i + 1);
            answer += str2.substring(i, i + 1);
            // answer += str1.charAt(i);
            // answer += str2.charAt(i);
        }

        return answer;
    }
}
