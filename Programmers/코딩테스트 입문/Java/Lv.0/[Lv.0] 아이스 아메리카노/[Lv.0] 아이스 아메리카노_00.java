class Solution {
    public int[] solution(int money) {
        // 아메리카노 한 잔 = 5500
        // 아메리카노 잔 수 = 몫, 잔돈 = 나머지
        // 5500 / 5500, 5500 % 5500 = 1, 0
        int[] answer = {money / 5500, money % 5500};
        return answer; // [1, 0]

        // return new int[] {money / 5500, money % 5500};
    }
}
