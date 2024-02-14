import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            // finished[i]가 false일 경우
            if (finished[i] == false) {
                list.add(todo_list[i]); // 추가
            }
        }

        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
}
