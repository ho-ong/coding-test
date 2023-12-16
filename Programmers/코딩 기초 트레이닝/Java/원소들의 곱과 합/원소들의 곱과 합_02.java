import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).reduce((num, i) -> num * i).getAsInt() < Math.pow(Arrays.stream(num_list).sum(), 2) ? 1 : 0;
    }
}
