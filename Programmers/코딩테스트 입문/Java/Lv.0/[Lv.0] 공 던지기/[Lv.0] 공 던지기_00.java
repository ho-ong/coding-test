class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;

        for (int i = 1; i < k; i++) {
            // answer 2씩 증가
            answer += 2;

            // answer가 클 경우
            if (answer > numbers.length) {
                // numbers 배열의 첫 번째 위치로 이동하기
                // answer - numbers 배열의 길이
                answer -= numbers.length;
            }
        }

        return answer;
    }
}
