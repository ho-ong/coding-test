class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                // 문자열의 원소를 반복하여 모두 합치기
                // charAt(): String 문자열 중 한 글자를 선택하여 char 문자로 변환
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
