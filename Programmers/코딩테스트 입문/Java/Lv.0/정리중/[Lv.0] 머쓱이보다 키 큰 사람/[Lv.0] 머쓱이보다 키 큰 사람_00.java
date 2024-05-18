class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            // array 배열의 원소가 클 경우
            if (array[i] > height) {
                // answer 증가
                answer++;
            }
        }

        return answer;
    }
}
