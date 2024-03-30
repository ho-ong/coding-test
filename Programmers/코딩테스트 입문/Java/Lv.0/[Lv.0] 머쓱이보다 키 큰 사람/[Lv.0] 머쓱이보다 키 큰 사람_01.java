import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        // 배열 스트림 생성 -> filter -> 개수 계산
        // filter(): 스트림 내 원소들을 하나씩 평가하여 추출
        // count(): 개수 반환

        // i가 클 경우 개수를 추출
        // [149, 180, 192, 170] > 167
        return (int) Arrays.stream(array).filter(i -> i > height).count(); // 3
    }
}
