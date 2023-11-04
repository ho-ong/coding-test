import math

def solution(balls, share):
    # balls = n, share = m
    # 경우의 수 = n! / (n - m)! * m!
    # factorial() : 팩토리얼 (1 * 2, 1 * 2 * 3, ...)
    return math.factorial(balls) / (math.factorial(balls - share) * math.factorial(share))
