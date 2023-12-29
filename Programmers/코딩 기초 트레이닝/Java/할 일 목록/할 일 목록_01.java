class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";

        for (int i = 0; i < finished.length; i++) {
            // finished[i]가 false일 경우
            answer = finished[i] == false ? answer + todo_list[i] + "," : answer;
        }

        return answer.split(",");
    }
}
