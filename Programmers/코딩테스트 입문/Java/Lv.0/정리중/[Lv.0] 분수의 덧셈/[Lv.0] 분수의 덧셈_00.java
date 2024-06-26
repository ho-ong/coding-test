class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 1; // 최대공약수

        // 분수 계산 시 통분, 약분은 필수이다.
        // 약분을 위해 최대공약수를 구한다.

        // 분자와 분모 구하기 (통분)
        // 분자 = 분자1 * 분모2 + 분자2 * 분모1
        // 분모 = 분모1 * 분모2
        answer[0] = numer1 * denom2 + numer2 * denom1; // 분자
        answer[1] = denom1 * denom2; // 분모

        // 최대공약수 구하기
        // 1부터 시작 (분자와 분모는 0일 경우 X)
        // 분자와 분모 중 분모의 값이 작으므로 분모 answer[1]까지 반복 (굳이 큰 값까지 반복할 필요 X)
        for (int i = 1; i <= answer[1]; i++) {
            // 분자와 분모를 i로 나눴을 때, 나머지가 0일 경우 공약수
            // 공약수 중 최대인 공약수를 찾아야 하므로 반복
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                max = i; // 최대공약수
            }
        }

        // 분자와 분모를 최대공약수로 나누기 (약분)
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }
}
