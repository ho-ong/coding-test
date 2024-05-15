class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            // numbers 배열의 원소에 2를 곱하기
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
