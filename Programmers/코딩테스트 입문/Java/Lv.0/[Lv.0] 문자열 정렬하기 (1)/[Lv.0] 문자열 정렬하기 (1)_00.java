import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // [a-z]: a부터 z까지
        // my_string의 문자열 중 [a-z]를 ""으로 치환
        // "hi12392" -> "12392"
        String s = my_string.replaceAll("[a-z]", "");

        // "" 기준으로 문자열을 분리하여 str 배열에 저장 후 반환
        // "12392" -> ["1", "2", "3", "9", "2"]
        String[] str = s.split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            // str 배열의 원소를 int형으로 변환 후 넣기
            // ["1", "2", "3", "9", "2"] -> [1, 2, 3, 9, 2]
            answer[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(answer); // 오름차순 정렬 [1, 2, 2, 3, 9]
        return answer;
    }
}
