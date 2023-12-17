class Solution {
    public int solution(int price) {
        // 할인가 = price * 할인율(100 - 퍼센트(%))
        return (int) (price >= 500_000 ? price - price * 0.2 : price >= 300_000 ? price - price * 0.1 : price >= 100_000 ? price - price * 0.05 : price);
    }
}
