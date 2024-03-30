class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            // array 배열의 원소가 클 경우
            // [149, 180, 192, 170] > 167
            if (array[i] > height) {
                // answer 증가 -> 3
                answer++;
            }
        }

        return answer;
    }
}
