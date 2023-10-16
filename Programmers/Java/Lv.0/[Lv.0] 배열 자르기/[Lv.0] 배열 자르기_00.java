class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        // 인덱스 num1부터 num2까지 자른 원소 구하기
        for (int i = num1; i <= num2; i++) {
            // num1이 1이면 answer[0] = numbers[1]
            answer[i - num1] = numbers[i];
        }

        return answer;
    }
}
