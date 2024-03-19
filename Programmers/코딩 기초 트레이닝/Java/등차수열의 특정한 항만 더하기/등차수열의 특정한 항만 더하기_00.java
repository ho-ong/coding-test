class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        // 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
        // 공차: 등차수열이나 등차급수에서 서로 이웃하는 두 항의 차

        for (int i = 0; i < included.length; i++) {
            // included 배열의 원소가 true일 경우 등차수열의 합계 구하기
            if (included[i]) {
                // 공차가 d이므로 d에 i를 곱하기 (3 + 0, 3 + 4, 3 + 8, ...)
                // 3 + 15 + 19 = 37
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
