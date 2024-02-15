import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            // 배열의 원소를 모두 합치기
            answer += str[i];
        }

        return answer;
    }
}
