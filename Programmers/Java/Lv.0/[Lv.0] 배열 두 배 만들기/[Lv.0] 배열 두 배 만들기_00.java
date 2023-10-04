class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            // 배열의 i번째 원소의 값을 두 배로 만들기
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
