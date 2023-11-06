def solution(rsp):
    # 0 -> 5, 2 -> 0, 5 -> 2
    answer = {'0': '5', '2': '0', '5': '2'}
    return ''.join(answer[i] for i in rsp)
