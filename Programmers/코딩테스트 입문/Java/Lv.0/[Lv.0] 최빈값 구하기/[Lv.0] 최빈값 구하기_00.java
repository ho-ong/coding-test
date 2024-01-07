import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        int max = 0; // 최댓값
        max = array[array.length - 1];
        int count[] = new int[max + 1]; // 빈도수

        // 배열의 원소가 같은지 확인
        for (int i = 0; i < array.length; i++) {
            // 배열의 원소가 같을 경우 count 증가
            count[array[i]]++;
        }

        max = count[0];

        // 최빈값 구하기
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                // 최빈값이 1개일 경우 i
                max = count[i];
                answer = i;
            } else if (max == count[i]) {
                // 최빈값이 여러 개일 경우 -1
                answer = -1;
            }
        }

        return answer;
    }
}
