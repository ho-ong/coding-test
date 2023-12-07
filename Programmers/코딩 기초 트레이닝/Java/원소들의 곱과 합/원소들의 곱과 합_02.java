import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
    }
}
