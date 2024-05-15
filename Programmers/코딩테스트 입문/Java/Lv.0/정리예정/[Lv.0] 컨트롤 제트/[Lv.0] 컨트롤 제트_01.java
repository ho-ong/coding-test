import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // stack 생성
        Stack<Integer> stack = new Stack<>();

        // split(): 문자열 분리
        // 문자열 s를 " " 기준으로 분리하고, 문자열 ss에 순서대로 저장
        for (String ss : s.split(" ")) {
            // 문자열 ss가 "Z"일 경우
            if (ss.equals("Z")) {
                // stack에서 빼기
                stack.pop();
            } else {
                // Integer.parseInt(): 정수로 변환
                // 문자열 ss를 정수로 변환하기
                // stack에 넣기
                stack.push(Integer.parseInt(ss));
            }
        }

        for (int i : stack) {
            answer += i;
        }

        return answer;
    }
}
