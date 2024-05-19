class Solution {
    public int solution(int price) {
        int answer = 0;

        // 할인가 = 가격 * 할인율(100 - 퍼센트(%))
        // 정수 부분 반환 => int형 정수 변환

        // 50만 원 이상 살 경우 20% 할인 => 할인율 0.8
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        // 30만 원 이상 살 경우 10% 할인 => 할인율 0.9
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        // 10만 원 이상 살 경우 5% 할인 => 할인율 0.95
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        // default
        } else {
            answer = price;
        }

        return answer;
    }
}
