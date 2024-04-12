import java.util.*;

class Solution {
    public int[] solution(int n) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // list에 원소 추가
        // [10]
        list.add(n);

        // n이 1이 아닐 경우
        while (n != 1) {
            // n을 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
            // 짝수일 경우 n / 2, 홀수일 경우 n * 3 + 1
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;

            // list에 원소 추가
            // [10, 5, 16, 8, 4, 2, 1]
            list.add(n);
        }

        // 리스트 -> 배열
        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
