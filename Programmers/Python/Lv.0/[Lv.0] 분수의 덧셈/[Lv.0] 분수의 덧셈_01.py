import math

def solution(numer1, denom1, numer2, denom2):
    # 분자와 분모
    numer = numer1 * denom2 + numer2 * denom1
    denom = denom1 * denom2

    # 최대공약수 구하기
    # gcd() : 최대공약수
    gcd = math.gcd(numer, denom)

    # 분자와 분모를 최대공약수로 나누기
    return [numer // gcd, denom // gcd]
