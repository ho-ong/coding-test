class Solution {
    public int[] solution(int money) {
        // 아메리카노 한 잔 = 5500
        // 아메리카노 잔 수 = 몫, 잔돈 = 나머지
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
