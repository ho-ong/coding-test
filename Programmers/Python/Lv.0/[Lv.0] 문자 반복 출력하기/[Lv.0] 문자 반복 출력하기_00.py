def solution(my_string, n):
    answer = ''

    for i in range(len(my_string)):
        # 문자열의 원소를 반복하여 모두 합치기
        answer += my_string[i] * n

    return answer
