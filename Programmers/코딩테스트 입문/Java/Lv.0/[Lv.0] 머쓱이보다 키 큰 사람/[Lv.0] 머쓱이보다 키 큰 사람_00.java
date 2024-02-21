class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            // height보다 클 경우
            if (array[i] > height) {
                answer++; // 증가
            }
        }

        return answer;
    }
}
