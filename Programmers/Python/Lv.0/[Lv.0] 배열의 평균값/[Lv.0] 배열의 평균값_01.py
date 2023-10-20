def solution(numbers):
    answer = 0

    for i in numbers:
        # 배열의 원소를 모두 더하기
        answer += i

    # 평균값 = 원소의 합 / 원소의 개수
    return answer / len(numbers)
