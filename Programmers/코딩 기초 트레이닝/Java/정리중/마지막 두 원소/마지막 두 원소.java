class Solution {
    public int[] solution(int[] num_list) {
        // + 1 하는 이유?
        // result의 배열 길이가 1만큼 더 길다.
        int[] answer = new int[num_list.length + 1];
        int a = num_list[num_list.length - 1]; // 배열의 마지막 원소
        int b = num_list[num_list.length - 2]; // 배열의 마지막 이전 원소

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        // 배열의 마지막 원소가 클 경우 a - b, 아닐 경우 a * 2
        if (a > b) {
            answer[num_list.length] = a - b;
        } else {
            answer[num_list.length] = a * 2;
        }

        return answer;
    }
}
