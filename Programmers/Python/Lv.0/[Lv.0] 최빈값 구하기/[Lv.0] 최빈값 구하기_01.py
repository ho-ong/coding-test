def solution(array):
    while len(array) != 0:
        # enumerate() : 리스트의 원소에 인덱스를 부여
        for i, j in enumerate(set(array)):
            array.remove(j)

        # 중복을 제거하고 남은 값 (최빈값)
        if i == 0:
            return j

    # 최빈값이 여러 개면 -1
    return -1
