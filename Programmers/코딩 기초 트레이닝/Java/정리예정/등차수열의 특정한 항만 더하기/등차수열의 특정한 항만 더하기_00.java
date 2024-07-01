class Solution {
    public int solution(int a, int d, boolean[] included) {
        // 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
        // 공차: 등차수열이나 등차급수에서 서로 이웃하는 두 항의 차
        int answer = 0;

        // 등차수열 구하기
        for (int i = 0; i < included.length; i++) {
            // 배열의 원소가 true일 경우
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
