class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";

        for (int i = 0; i < finished.length; i++) {
            // finished[i]가 false일 경우
            if (finished[i] == false) {
                // 배열의 원소를 모두 추가하기
                answer += todo_list[i] + ",";
            }
        }

        return answer.split(",");
    }
}
