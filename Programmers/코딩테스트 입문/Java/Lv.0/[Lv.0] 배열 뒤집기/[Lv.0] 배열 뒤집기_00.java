class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            // 마지막 원소부터 역순으로 배열에 넣기 (배열의 마지막 원소 - i)
            answer[i] = num_list[num_list.length - 1 - i];
        }

        return answer;
    }
}
