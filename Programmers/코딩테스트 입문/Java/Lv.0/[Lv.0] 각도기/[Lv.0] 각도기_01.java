class Solution {
    public int solution(int angle) {
        // 180도일 경우 평각, 90도 미만일 경우 예각, 90도일 경우 직각, 90도 초과일 경우 둔각
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}
