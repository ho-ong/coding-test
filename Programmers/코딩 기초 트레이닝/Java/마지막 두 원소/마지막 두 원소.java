class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int a = num_list[num_list.length - 1]; // 마지막 원소
        int b = num_list[num_list.length - 2]; // 그전 원소

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (a > b) {
            // 마지막 원소가 클 경우
            answer[num_list.length] = a - b;
        } else {
            // 마지막 원소가 작을 경우
            answer[num_list.length] = a * 2;
        }

        return answer;
    }
}
