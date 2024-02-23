import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        // numlist 배열의 원소를 num에 넣기
        for (int num : numlist) {
            // 나머지가 0일 경우 n의 배수
            if (num % n == 0) {
                list.add(num); // 추가
            }
        }

        // list의 원소를 int형으로 변환하여 배열 생성하기
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
