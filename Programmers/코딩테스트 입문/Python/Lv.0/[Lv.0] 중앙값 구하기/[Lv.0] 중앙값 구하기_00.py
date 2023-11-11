def solution(array):
    array.sort()

    # 중앙값 = 배열의 길이 / 2
    return array[len(array) // 2]
