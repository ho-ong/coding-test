import java.math.BigInteger;

class Solution {
    // 팩토리얼 함수
    public BigInteger fac(int num) {
        // BigInteger: 무한대 정수, 큰 정수 처리 시 사용
        // 문자열 형태로 정수를 처리하므로 큰 정수를 담는 것이 가능 (초기화 시 매개변수는 문자열)
        // String.valueOf(): 문자열로 변환
        BigInteger big = new BigInteger("1");

        // 팩토리얼 구하기
        for (int i = 1; i <= num; i++) {
            // balls (num = 3) -> "1", "2", "3" -> 1 * 2 * 3 = 6
            // share (num = 2) -> "1", "2" -> 1 * 2 = 2
            big = big.multiply(new BigInteger(String.valueOf(i)));
        }

        return big;
    }

    public BigInteger solution(int balls, int share) {
        // BigInteger 사칙연산 시 BigIntger 클래스 내부 메서드 사용 (add(), subtract(), multiply(), divide(), remainder())
        // 문자열이므로 일반적인 사칙연산 불가 (+, -, *, /, % 사용 불가)

        // balls = n, share = m
        // 경우의 수 = n! / ((n - m)! * m!)
        // 3! / ((3 - 2)! * 2!) = 6 / (1 * 2) = 3
        return fac(balls).divide((fac(balls - share).multiply(fac(share))));
    }
}
