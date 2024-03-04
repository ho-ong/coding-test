import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 오름차순 정렬 [1, 2, 7, 10, 11]

        // 중앙값 = 배열의 길이 / 2 (5 / 2 = 2)
        // array 배열 내 인덱스 2에 위치한 원소 = 7
        return array[array.length / 2];
    }
}
