def solution(num_list):
    answer = [0, 0]

    for i in num_list:
        answer[i % 2] += 1 # 짝수면 짝수, 홀수면 홀수

    return answer
