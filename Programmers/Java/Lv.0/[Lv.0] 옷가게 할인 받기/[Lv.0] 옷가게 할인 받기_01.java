class Solution {
    public int solution(int price) {
        // 할인가 = price * 할인율(100 - 할인%)
        if (price >= 500000) return (int) (price * 0.8);
        else if (price >= 300000) return (int) (price * 0.9);
        else if (price >= 100000) return (int) (price * 0.95);
    }
}
