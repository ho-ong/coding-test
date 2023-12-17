class Solution {
    public int solution(int angle) {
        // 평각, 예각, 직각, 둔각
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}
