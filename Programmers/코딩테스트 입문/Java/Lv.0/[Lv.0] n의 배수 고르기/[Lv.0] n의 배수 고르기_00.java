import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // numlist 배열의 원소를 num에 넣기
        for (int num : numlist) {
            // num을 n으로 나눴을 때, 나머지가 0일 경우 n의 배수
            if (num % n == 0) {
                // list에 추가
                list.add(num);
            }
        }

        // 리스트 -> 배열
        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): 스트림을 IntStream으로 변환 (Integer -> int)
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
