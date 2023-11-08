class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;

        for (int i = 1; i < k; i++) {
            answer += 2; // 2씩 증가

            if (answer > numbers.length) {
                // 배열의 첫 번째 위치로 이동하기 (answer - 배열의 길이)
                answer -= numbers.length;
            }
        }

        return answer;
    }
}
