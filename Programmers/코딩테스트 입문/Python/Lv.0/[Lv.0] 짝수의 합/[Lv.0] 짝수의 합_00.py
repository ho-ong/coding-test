def solution(n):
    answer = 0

    # 짝수 구하기 (2부터 시작, 2씩 증가)
    for i in range(2, n + 1, 2):
        # 짝수를 모두 더하기
        answer += i

    return answer
