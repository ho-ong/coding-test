import java.util.*;

class Solution {
    public int solution(int[] array) {
        // array 배열 오름차순 정렬
        Arrays.sort(array);

        // 중앙값 = 배열의 길이 / 2
        return array[array.length / 2];
    }
}
