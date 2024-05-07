class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // emergency[i] = 이전 원소
        // emergency[j] = 다음 원소
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                // emergency[i]가 클 경우
                if (emergency[i] > emergency[j]) {
                    // emergency[j] 증가
                    answer[j]++;
                }
            }

            // emergency[i] 증가
            answer[i]++;
        }

        return answer;
    }
}
