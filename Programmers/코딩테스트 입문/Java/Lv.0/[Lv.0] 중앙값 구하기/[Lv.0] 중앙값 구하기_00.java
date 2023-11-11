import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        // 중앙값 = 배열의 길이 / 2
        return array[array.length / 2];
    }
}
