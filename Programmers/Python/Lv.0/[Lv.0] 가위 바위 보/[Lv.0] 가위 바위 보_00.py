def solution(rsp):
    answer = ''

    for i in rsp:
        if i == '0':
            answer += '5' # 0 -> 5
        elif i == '2':
            answer += '0' # 2 -> 0
        else:
            answer += '2' # 5 -> 2

    return answer
