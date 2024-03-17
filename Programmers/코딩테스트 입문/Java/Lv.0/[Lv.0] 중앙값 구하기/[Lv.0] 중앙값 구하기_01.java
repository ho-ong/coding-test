import java.util.*;

class Solution {
    public int solution(int[] array) {
        // array 배열 오름차순 정렬 [1, 2, 7, 10, 11]
        Arrays.sort(array);

        // 중앙값 = 배열의 길이 / 2 = 오른쪽으로 1비트 이동한 값
        // 5 / 2 = 2
        // array[2] = 7
        return array[array.length >> 1];
    }
}
