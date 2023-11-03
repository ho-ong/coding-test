import java.math.BigInteger;

class Solution {
    // 팩토리얼 함수
    public BigInteger fac(int n) {
        // BigInteger : 큰 정수를 처리, 문자열 형태로 숫자를 처리
        BigInteger answer = new BigInteger("1");
        BigInteger from = new BigInteger("1");
        BigInteger to = new BigInteger(String.valueOf(n));

        // compareTo() : 숫자 또는 문자열을 비교하여 값을 반환
        // 숫자의 비교 : 크다(1), 같다(0), 작다(-1)
        // 문자열의 비교 : 같다(0), 양수/음수 값
        for (BigInteger i = from; i.compareTo(to) <= 0; i = i.add(BigInteger.ONE)) {
            answer = answer.multiply(i);
        }

        return answer;
    }

    public BigInteger solution(int balls, int share) {
        // balls = n, share = m
        // 경우의 수 = n! / (n - m)! * m!
        return fac(balls).divide((fac(balls - share).multiply(fac(share))));
    }
}
