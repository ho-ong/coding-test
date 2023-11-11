def solution(n):
    answer = 1

    # 피자의 조각 수 = 피자의 판 수 * 6
    # n으로 나누기
    # 나머지가 있으면 피자의 판 수 증가
    while answer * 6 % n != 0:
        answer += 1

    return answer
