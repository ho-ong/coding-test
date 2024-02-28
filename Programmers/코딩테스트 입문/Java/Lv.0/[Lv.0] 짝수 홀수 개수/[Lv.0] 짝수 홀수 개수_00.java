class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i = 0; i < num_list.length; i++) {
            // num_list 배열의 원소를 2로 나누기
            // 나머지가 0일 경우 짝수, 1일 경우 홀수
            if (num_list[i] % 2 == 0) {
                // 짝수, 첫 번째 원소 증가 [1, 0]
                answer[0]++;
            } else {
                // 홀수, 두 번째 원소 증가 [0, 1]
                answer[1]++;
            }
        }

        return answer;
    }
}
