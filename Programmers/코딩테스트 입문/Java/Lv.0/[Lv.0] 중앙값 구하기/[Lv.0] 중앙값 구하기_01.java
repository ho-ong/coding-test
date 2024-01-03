import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        // 중앙값 = 배열의 길이 / 2
        // 오른쪽으로 1비트 옯긴 값 = 2로 나눈 값
        return array[array.length >> 1];
    }
}
