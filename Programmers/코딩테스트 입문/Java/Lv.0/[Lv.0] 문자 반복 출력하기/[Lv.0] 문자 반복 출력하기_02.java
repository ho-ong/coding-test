class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        // toCharArray(): String 문자열을 char 문자로 분리하고, char[] 배열에 순서대로 저장 후 반환
        for (char c : my_string.toCharArray()) {
            // 문자열의 원소를 반복하여 모두 합치기
            sb.append((c + "").repeat(n));
        }

        return sb.toString();
    }
}
