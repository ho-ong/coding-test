def solution(price):
    # 할인가 = price * 할인율(100 - 할인%)
    if price >= 500000:
        price *= 0.8
    elif price >= 300000:
        price *= 0.9
    elif price >= 100000:
        price *= 0.95

    return int(price)
