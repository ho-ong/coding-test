class Solution {
    public int[] solution(int money) {
        // 아메리카노 잔 수 = 몫, 잔돈 = 나머지
        // return new int[] {money / 5500, money % 5500};
        int[] answer = {money / 5500, money % 5500};
        return answer;
    }
}
