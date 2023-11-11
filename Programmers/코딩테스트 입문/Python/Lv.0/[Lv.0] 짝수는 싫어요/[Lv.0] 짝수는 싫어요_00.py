def solution(n):
    answer = []

    # 배열의 홀수 원소 구하기 (1부터 시작, 2씩 증가)
    for i in range(1, n + 1, 2):
        answer.append(i)

    return answer
