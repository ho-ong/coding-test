def solution(slice, n):
    # n을 slice로 나누기 (피자 slice조각)
    # 나머지가 있으면 + 1 (최소 피자 1판 필요)
    return (n - 1) // slice + 1
