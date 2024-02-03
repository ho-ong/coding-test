import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // [a-z]: a부터 z까지
        String s = my_string.replaceAll("[a-z]", "");
        String[] str = s.split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            // 배열에 원소를 넣기
            answer[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(answer);
        return answer;
    }
}
