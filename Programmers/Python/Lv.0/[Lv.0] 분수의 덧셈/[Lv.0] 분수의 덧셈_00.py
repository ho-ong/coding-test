def solution(numer1, denom1, numer2, denom2):
    # 분자와 분모
    numer = numer1 * denom2 + numer2 * denom1
    denom = denom1 * denom2

    # 최대공약수 구하기
    for i in range(2, denom):
        while numer % i == 0 and denom % i == 0:
            # 분자와 분모를 최대공약수로 나누기
            numer /= i
            denom /= i

    return [numer, denom]
