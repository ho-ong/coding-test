class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            // included의 원소가 true일 경우
            if (included[i]) {
                // 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
                // 등차수열 더하기
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
