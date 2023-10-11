class Solution {
    public int solution(int price) {
        int answer = 0;

        // 할인가 = price * 할인율(100 - 할인 %)
        if (price >= 500000) {
            answer = (int) (price *= 0.8);
        } else if (price >= 300000) {
            answer = (int) (price *= 0.9);
        } else if (price >= 100000) {
            answer = (int) (price *= 0.95);
        } else {
            answer = price;
        }

        return answer;
    }
}
