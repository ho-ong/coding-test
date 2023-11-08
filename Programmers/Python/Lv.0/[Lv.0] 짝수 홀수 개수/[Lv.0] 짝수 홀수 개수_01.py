def solution(num_list):
    answer = [0, 0]

    for i in num_list:
        # 짝수면 짝수, 홀수면 홀수
        answer[i % 2] += 1

    return answer
