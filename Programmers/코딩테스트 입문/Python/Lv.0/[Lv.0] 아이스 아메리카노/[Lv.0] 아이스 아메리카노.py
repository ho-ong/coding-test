def solution(money):
    # 아메리카노 잔 수 = 몫, 잔돈 = 나머지
    return [money // 5500, money % 5500]
