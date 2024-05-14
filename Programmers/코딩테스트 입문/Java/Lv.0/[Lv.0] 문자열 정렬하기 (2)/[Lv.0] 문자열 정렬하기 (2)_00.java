import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        // my_string 문자열 소문자 변환,
        // "" 기준으로 문자열을 분리하여 str 배열에 저장 후 반환
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str); // 오름차순 정렬

        for (int i = 0; i < str.length; i++) {
            // str 배열의 원소를 합치기
            answer += str[i];
        }

        return answer;
    }
}
