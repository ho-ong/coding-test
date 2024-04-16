class Solution {
    public int solution(int[] box, int n) {
        // box[0] = 상자의 가로 길이
        // box[1] = 상자의 세로 길이
        // box[2] = 상자의 높이 길이

        // 주사위의 모서리 길이 = n

        // 상자의 부피 = 가로 길이 * 세로 길이 * 높이 길이
        // 주사위의 개수 = (상자의 가로 길이 / n) * (상자의 세로 길이 / n) * (상자의 높이 길이 / n)
        // (1 / 1) * (1 / 1) * (1 / 1) = 1
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
