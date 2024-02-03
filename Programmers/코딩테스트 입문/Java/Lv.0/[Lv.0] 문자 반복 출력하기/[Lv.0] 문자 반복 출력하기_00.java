class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        // split(): 문자열을 분리하여 배열에 저장 후 반환
        String[] str = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            // 문자열의 원소를 반복하여 모두 합치기
            answer += str[i].repeat(n);
        }

        return answer;
    }
}
