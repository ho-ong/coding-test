import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (첫 번째 매개변수는 정규식)
        // 문자열 my_string 내 문자열 a부터 z까지를 ""으로 치환 (""으로 치환 시 제거와 동일)

        // 정규표현식(Regular Expression)
        // [a-z]: a부터 z까지
        String s = my_string.replaceAll("[a-z]", "");

        // split(): 문자열 분리
        // 문자열 s를 "" 기준으로 분리하고, str 배열에 순서대로 저장
        String[] str = s.split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            // Integer.parseInt(): 정수로 변환
            // str 배열의 원소를 정수로 변환하여 넣기
            answer[i] = Integer.parseInt(str[i]);
        }

        // answer 배열 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}
