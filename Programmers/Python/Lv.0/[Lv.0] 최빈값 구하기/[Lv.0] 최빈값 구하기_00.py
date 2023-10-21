def solution(array):
    answer = 0
    count = 0 # 빈도수

    # 최빈값 구하기
    for i in set(array):
        if array.count(i) > count:
            # 최빈값이 1개면 i
            count = array.count(i)
            answer = i
        elif array.count(i) == count:
            # 최빈값이 여러 개면 -1
            answer = -1

    return answer
