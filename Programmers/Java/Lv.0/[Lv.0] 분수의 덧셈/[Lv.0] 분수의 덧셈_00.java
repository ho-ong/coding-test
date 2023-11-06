class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 1;

        // 분자와 분모
        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;

        // 최대공약수 구하기
        for (int i = 1; i <= answer[1]; i++) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                max = i;
            }
        }

        // 분자와 분모를 최대공약수로 나누기
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }
}
