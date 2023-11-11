def solution(n):
    answer = 0

    # n의 약수 구하기
    for i in range(1, n + 1):
        # 나머지가 0이면 n의 약수
        if n % i == 0:
            answer += 1

    return answer
