class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                // emergency[i] = 앞의 원소, emergency[j] = 뒤의 원소
                if (emergency[i] > emergency[j]) {
                    answer[j]++; // 뒤의 원소 응급도 증가
                }
            }

            answer[i]++; // 앞의 원소 응급도 증가
        }

        return answer;
    }
}
