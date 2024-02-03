import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        // reduce(): stream의 원소들을 누적 연산하여 하나의 값을 반환
        // getAsInt(): Int 반환
        // Math.pow(): 제곱 반환
        return Arrays.stream(num_list).reduce((num, i) -> num * i).getAsInt() < Math.pow(Arrays.stream(num_list).sum(), 2) ? 1 : 0;
    }
}
