class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            // numbers 배열의 원소에 2를 곱하기
            // [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
