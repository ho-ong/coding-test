def solution(num_list):
    answer = [0, 0]

    for i in num_list:
        if i % 2 == 0:
            answer[0] += 1 # 짝수
        else:
            answer[1] += 1 # 홀수

    return answer
