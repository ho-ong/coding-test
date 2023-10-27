def solution(n):
    # n의 약수 구하기 (나머지가 0이면 n의 약수)
    return len([i for i in range(1, n + 1) if n % i == 0])
