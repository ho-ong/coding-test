class Solution {
    public int solution(int[] dot) {
        // 제1사분면, 제2사분면, 제3사분면, 제4사분면
        return dot[0] > 0 && dot[1] > 0 ? 1 : dot[0] < 0 && dot[1] > 0 ? 2 : dot[0] < 0 && dot[1] < 0 ? 3 : 4;
    }
}
