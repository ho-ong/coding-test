def solution(my_string, n):
    # 문자열의 원소를 반복하여 모두 합치기
    return ''.join(i * n for i in my_string)
