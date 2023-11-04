import math

def solution(balls, share):
    # comb(n, k) : nCk 같은 조합 값을 반환 (n개의 수에서 k개를 선택)
    return math.comb(balls, share)
