def solution(price):
    # 할인가 = price * 할인율(100 - 할인%)
    discount = { 500000: 0.8, 300000: 0.9, 100000: 0.95, 0: 1 }

    for i, j in discount.items():
        if price >= i:
            return int(price * j)
