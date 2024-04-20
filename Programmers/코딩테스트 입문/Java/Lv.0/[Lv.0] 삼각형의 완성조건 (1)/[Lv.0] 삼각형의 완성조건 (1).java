import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // sides 배열 오름차순 정렬
        // [1, 2, 3]
        Arrays.sort(sides);

        // 두 변의 길이의 합 > 가장 긴 변의 길이
        // sides[0] + sides[1]가 클 경우 1, 아닐 경우 2
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
