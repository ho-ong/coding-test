class Solution {
    public double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            // numbers 배열의 원소를 더하기
            // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] -> 55
            answer += numbers[i];
        }

        // 평균값 = 배열의 원소의 합 / 배열의 원소의 개수
        // 55 / 10 = 5.5
        return answer / numbers.length;
    }
}
