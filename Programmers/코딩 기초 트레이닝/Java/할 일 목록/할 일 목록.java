import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            // finished[i]가 false일 경우
            if (finished[i] == false) {
                // todo_list의 원소를 문자열 배열에 추가
                answer.add(todo_list[i]);
            }
        }

        return answer;
    }
}
