import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            // str의 원소가 "Z"일 경우
            if (str[i].equals("Z")) {
                // 바로 전에 더했던 str의 원소 빼기
                answer -= Integer.parseInt(str[i - 1]);
            } else {
                // str의 원소 더하기
                answer += Integer.parseInt(str[i]);
            }
        }

        return answer;
    }
}
