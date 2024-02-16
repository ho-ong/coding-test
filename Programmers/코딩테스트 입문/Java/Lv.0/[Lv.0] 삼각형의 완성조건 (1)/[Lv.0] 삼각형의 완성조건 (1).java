import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 두 변의 길이의 합 > 가장 긴 변의 길이
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
