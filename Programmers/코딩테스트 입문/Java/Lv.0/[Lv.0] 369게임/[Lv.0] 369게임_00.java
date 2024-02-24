class Solution {
    public int solution(int order) {
        int answer = 0;

        // order가 0이 아닐 경우
        while (order != 0) {
            // 나머지가 3, 6, 9일 경우
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++; // 증가
            }

            order /= 10; // 나누기
        }

        return answer;
    }
}
