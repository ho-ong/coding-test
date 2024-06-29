class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            // 배열의 마지막 원소부터 첫 번째 원소까지 역순으로 넣기
            // 배열의 마지막 원소 = 배열의 길이 - 1
            answer[i] = num_list[num_list.length - 1 - i];
        }

        return answer;
    }
}
