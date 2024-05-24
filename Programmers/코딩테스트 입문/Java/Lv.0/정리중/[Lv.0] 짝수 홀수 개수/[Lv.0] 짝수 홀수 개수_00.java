class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i = 0; i < num_list.length; i++) {
            // num_list 배열의 원소를 2로 나눴을 때, 나머지가 0일 경우
            if (num_list[i] % 2 == 0) {
                answer[0]++; // 배열의 첫 번째 원소 증가
            } else {
                answer[1]++; // 배열의 두 번째 원소 증가
            }
        }

        return answer;
    }
}
