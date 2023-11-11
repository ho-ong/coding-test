class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            // direction이 "right"일 경우
            // answer 배열의 처음 원소 = numbers 배열의 마지막 원소
            answer[0] = numbers[numbers.length - 1];

            // numbers 배열의 마지막 원소 개수만큼 반복하기 (0부터 시작)
            for (int i = 0; i < numbers.length - 1; i++) {
                // answer[1] = numbers[0], answer[2] = numbers[1], ...
                answer[i + 1] = numbers[i];
            }
        } else {
            // direction이 "left"일 경우
            // answer 배열의 마지막 원소 = numbers 배열의 처음 원소
            answer[answer.length - 1] = numbers[0];

            // numbers 배열의 길이만큼 반복하기 (1부터 시작)
            for (int i = 1; i < numbers.length; i++) {
                // answer[0] = numbers[1], answer[1] = numbers[2], ...
                answer[i - 1] = numbers[i];
            }
        }

        return answer;
    }
}
