from fractions import Fraction

def solution(numer1, denom1, numer2, denom2):
    # fractions : 유리수를 계산할 때 사용하는 모듈
    # 유리수 : 두 정수의 비율 또는 분수 형식으로 나타낼 수 있는 수
    # Fraction(분자, 분모) / numerator : 분자 / denominator : 분모
    answer = Fraction(numer1, denom1) + Fraction(numer2, denom2)
    return [answer.numerator, answer.denominator]
