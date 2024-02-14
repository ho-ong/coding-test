import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n); // 추가

        // n이 1이 아닐 경우
        while (n != 1) {
            // 짝수일 경우 n / 2, 홀수일 경우 n * 3 + 1
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            list.add(n); // 추가
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
