def solution(n):
    # 짝수 구하기 (2부터 시작, 2씩 증가)
    return sum([i for i in range(2, n + 1, 2)])
