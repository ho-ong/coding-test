class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // [3, 76, 24]
        // emergency[i] = 이전 원소
        // emergency[j] = 다음 원소
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                // emergency[i]가 클 경우
                // 3 > 3, 3 > 76, 3 > 24
                // 76 > 3, 76 > 76, 76 > 24 -> 3, 24
                // 24 > 3, 24 > 76, 24 > 24 -> 3
                if (emergency[i] > emergency[j]) {
                    // emergency[j] 증가
                    // 3, 76, 24 -> 2, 0, 1
                    answer[j]++;
                }
            }

            // emergency[i] 증가
            // 3, 76, 24 -> 1, 1, 1
            answer[i]++;
        }

        // 3, 76, 24 -> 3, 1, 2 -> [3, 1, 2]
        return answer;
    }
}
