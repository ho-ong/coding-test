import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int answer = 0;
        int max = 0; // 최댓값
        max = array[array.length - 1];
        int count[] = new int[max + 1]; // 빈도수

        // 배열의 원소가 같은지 체크
        for (int i = 0; i < array.length; i++) {
            // 배열의 원소가 같으면 count 증가 (ex: 3이 3개면 3 증가)
            count[array[i]]++;
        }

        max = count[0];

        // 최빈값 구하기
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                // 최빈값이 1개면 i
                max = count[i];
                answer = i;
            } else if (max == count[i]) {
                // 최빈값이 여러 개면 -1
                answer = -1;
            }
        }

        return answer;
    }
}
