class Solution {
    public int[] solution(int money) {
        // 아메리카노 한 잔 = 5500
        // 아메리카노 잔 수 = 몫, 잔돈 = 나머지
        int[] answer = {money / 5500, money % 5500}; // 방법 1
        return answer;

        // return new int[] {money / 5500, money % 5500}; // 방법 2
    }
}
