class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        // direction이 "right"일 경우
        if (direction.equals("right")) {
            // answer 배열의 첫 번째 원소 = numbers 배열의 마지막 원소
            answer[0] = numbers[numbers.length - 1];

            for (int i = 0; i < numbers.length - 1; i++) {
                // i = 0 -> answer[1] = numbers[0]
                // answer[1] = numbers[0], answer[2] = numbers[1], ...
                answer[i + 1] = numbers[i];
            }
        // direction이 "left"일 경우
        } else {
            // answer 배열의 마지막 원소 = numbers 배열의 첫 번째 원소
            answer[answer.length - 1] = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                // i = 1 -> answer[0] = numbers[1]
                // answer[0] = numbers[1], answer[1] = numbers[2], ...
                answer[i - 1] = numbers[i];
            }
        }

        return answer;
    }
}
