def solution(age):
    answer = ''

    for i in str(age):
        # 97, 'a' : 아스키 코드 변환
        # chr() : 아스키 코드 -> 문자열 변환
        # ord() : 문자열 -> 아스키 코드 변환
        answer += chr(int(i) + 97)
        # answer += chr(ord('a') + int(i))

    return answer
