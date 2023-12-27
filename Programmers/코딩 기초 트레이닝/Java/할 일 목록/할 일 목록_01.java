class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";

        for (int i = 0; i < finished.length; i++) {
            answer = finished[i] == false ? answer + todo_list[i] + "," : answer;
        }

        return answer.split(",");
    }
}
