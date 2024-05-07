class Solution {
    public double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            // numbers 배열의 원소를 더하기
            answer += numbers[i];
        }

        // 평균값 = 배열의 원소의 합 / 배열의 원소의 개수
        return answer / numbers.length;
    }
}
