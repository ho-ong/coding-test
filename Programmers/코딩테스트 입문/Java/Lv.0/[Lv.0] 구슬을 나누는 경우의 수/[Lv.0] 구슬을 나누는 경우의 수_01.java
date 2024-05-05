import java.math.BigInteger;

class Solution {
    // 팩토리얼 함수
    public BigInteger fac(int num) {
        // BigInteger: 무한대 정수, 큰 정수 처리 시 사용
        // 문자열 형태로 정수를 처리하므로 큰 정수를 담는 것이 가능 (초기화 시 매개변수는 문자열)
        // String.valueOf(): 문자열로 변환
        BigInteger answer = new BigInteger("1");
        BigInteger start = new BigInteger("1"); // 시작 (1부터 시작)
        BigInteger end = new BigInteger(String.valueOf(num)); // 마지막

        // 팩토리얼 구하기

        // compareTo(): 숫자 또는 문자열을 비교하여 값 반환
        // 숫자 비교 값: 같다(0), 크다(1), 작다(-1)
        // 문자열 비교 값: 같다(0), 앞순(양수), 뒷순(음수) -> 사전적인 순서
        // i.compareTo(end) <= 0 -> "1"일 경우 start와 같으므로 0, "2"부터는 "1"의 뒷순이므로 음수

        // BigInteger 변수: ZERO(0), ONE(1), TEN(10)
        // i = i.add(BigInteger.ONE) -> 1씩 증가
        for (BigInteger i = start; i.compareTo(end) <= 0; i = i.add(BigInteger.ONE)) {
            // balls (end = 3) -> 1 * 2 * 3 = 6
            // share (end = 2) -> 1 * 2 = 2
            answer = answer.multiply(i);
        }

        return answer;
    }

    public BigInteger solution(int balls, int share) {
        // BigInteger 사칙연산 시 BigIntger 클래스 내부 메서드 사용 (add(), subtract(), multiply(), divide(), remainder())
        // 문자열이므로 일반적인 사칙연산 불가 (+, -, *, /, % 사용 불가)

        // balls = n, share = m
        // 경우의 수 = n! / ((n - m)! * m!)
        return fac(balls).divide((fac(balls - share).multiply(fac(share))));
    }
}
