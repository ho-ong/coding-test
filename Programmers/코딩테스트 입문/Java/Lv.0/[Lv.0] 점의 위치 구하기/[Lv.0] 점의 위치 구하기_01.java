class Solution {
    public int solution(int[] dot) {
        // dot[0], dot[1] 모두 양수일 경우 제1사분면, dot[0] 음수, dot[1] 양수일 경우 제2사분면
        // dot[0], dot[1] 모두 음수일 경우 제3사분면, 아닐 경우 제4사분면
        return dot[0] > 0 && dot[1] > 0 ? 1 : dot[0] < 0 && dot[1] > 0 ? 2 : dot[0] < 0 && dot[1] < 0 ? 3 : 4;
    }
}
