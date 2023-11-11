def solution(emergency):
    answer = []

    # sorted(emergency, reverse=True) : 내림차순 정렬
    num = sorted(emergency, reverse=True)

    for i in emergency:
        answer.append(num.index(i) + 1)

    return answer
