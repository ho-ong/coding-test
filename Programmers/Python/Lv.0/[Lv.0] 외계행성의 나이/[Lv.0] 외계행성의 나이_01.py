def solution(age):
    # 97 : 아스키 코드 변환
    # chr() : 아스키 코드 -> 문자열 변환
    return ''.join([chr(int(i) + 97) for i in str(age)])
