def solution(numbers, num1, num2):
    answer = []

    # 인덱스 num1부터 num2까지 자른 원소 구하기
    for i in range(num1, num2 + 1):
        answer.append(numbers[i])

    return answer
