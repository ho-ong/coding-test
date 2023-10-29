def solution(emergency):
    # sorted(emergency, reverse=True) : 내림차순 정렬
    return [sorted(emergency, reverse=True).index(i) + 1 for i in emergency]
