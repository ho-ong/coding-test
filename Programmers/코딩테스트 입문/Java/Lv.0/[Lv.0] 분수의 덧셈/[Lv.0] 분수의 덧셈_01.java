class Solution {
    // 최대공약수(Greatest Common Divisor, GCD)
    // 두 수 이상의 여러 공약수 중 최대인 공약수
    public int GCD(int num1, int num2) {
        // 분자와 분모를 나눴을 때, 나머지가 0일 경우 최대공약수
        if (num1 % num2 == 0) {
            return num2; // 최대공약수 2
        }

        // 분모, 분자와 분모를 나눈 나머지 반환
        return GCD(num2, num1 % num2);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;

        // 분자와 분모 구하기
        // 분자 = 분자1 * 분모2 + 분자2 * 분모1
        // 분모 = 분모1 * 분모2
        int[] answer = new int[] {numer1 + numer2, denom1 * denom2}; // 분자 10, 분모 8

        // 최대공약수 구하기
        int max = GCD(answer[0], answer[1]); // 최대공약수 2

        // 분자와 분모를 최대공약수로 나누기
        answer[0] /= max; // 10 / 2 = 5
        answer[1] /= max; // 8 / 2 = 4
        return answer; // [5, 4]
    }
}
