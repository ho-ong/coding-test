import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        // 배열의 길이를 2로 나누면 중앙값
        return array[array.length / 2];
    }
}
