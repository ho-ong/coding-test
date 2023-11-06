def solution(n):
    # 피자의 조각 수 = 피자의 판 수 * 6
    # n으로 나누기
    # 나머지가 있으면 피자의 판 수 증가
    for i in range(1, n + 1):
        if 6 * i % n == 0:
            return i
