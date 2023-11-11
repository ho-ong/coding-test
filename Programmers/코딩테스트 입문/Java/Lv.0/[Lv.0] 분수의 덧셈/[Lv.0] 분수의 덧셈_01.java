class Solution {
    // 최대공약수(Greatest Common Divisor, GCD)
    // 두 수 이상의 여러 수의 공약수 중 최대인 수
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return GCD(num2, num1 % num2);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;

        // 분자와 분모
        int[] answer = new int[] {numer1 + numer2, denom1 * denom2};

        // 최대공약수 구하기
        int max = GCD(answer[0], answer[1]);

        // 분자와 분모를 최대공약수로 나누기
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }
}
