import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // copyOf(array, length)
        // 인덱스 0부터 length까지 범위 내 배열의 원소를 복사하여 새로운 배열 반환
        int[] sort = Arrays.copyOf(emergency, emergency.length);

        // sort 배열 오름차순 정렬
        Arrays.sort(sort);

        // map 생성 (키, 값 저장)
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int cnt = 1;

        // sort 배열의 마지막 원소부터 첫 번째 원소까지 역순으로 넣기
        // 배열의 마지막 원소 = 배열의 길이 - 1
        for (int i = sort.length - 1; i >= 0; i--) {
            // map에 키, 값 추가
            map.put(sort[i], cnt++);
        }

        for (int i = 0; i < emergency.length; i++) {
            // emergency 배열의 원소와 일치하는 map의 키를 찾고, 키의 값을 넣기
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}
