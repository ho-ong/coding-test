def solution(angle):
    if 0 < angle and angle < 90:
        answer = 1 # 예각
    elif angle == 90:
        answer = 2 # 직각
    elif 90 < angle and angle < 180:
        answer = 3 # 둔각
    elif angle == 180:
        answer = 4 # 평각

    return answer
