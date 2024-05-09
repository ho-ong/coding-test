class Solution {
    public int solution(int a, int d, boolean[] included) {
        // 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
        // 공차: 등차수열이나 등차급수에서 서로 이웃하는 두 항의 차
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            // included 배열의 원소가 true일 경우
            if (included[i]) {
                // 등차수열을 더하기
                // 공차가 d이므로 d에 i를 곱하기
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
