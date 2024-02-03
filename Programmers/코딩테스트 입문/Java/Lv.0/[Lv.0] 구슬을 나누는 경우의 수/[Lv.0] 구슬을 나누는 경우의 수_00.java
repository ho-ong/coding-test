import java.math.BigInteger;

class Solution {
    // 팩토리얼 함수
    public BigInteger fac(int num) {
        // BigInteger: 큰 정수를 처리, 문자열 형태로 숫자를 처리
        BigInteger big = new BigInteger("1");

        // 팩토리얼 (1 * 2, 1 * 2 * 3, ...)
        for (int i = 1; i <= num; i++) {
            big = big.multiply(new BigInteger(String.valueOf(i)));
        }

        return big;
    }

    public BigInteger solution(int balls, int share) {
        // balls = n, share = m
        // 경우의 수 = n! / (n - m)! * m!
        return fac(balls).divide((fac(balls - share).multiply(fac(share))));
    }
}
