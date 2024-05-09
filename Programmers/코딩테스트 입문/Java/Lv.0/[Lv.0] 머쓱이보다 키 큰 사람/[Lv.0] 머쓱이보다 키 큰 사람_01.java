import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        // 배열 스트림 생성 -> 원소 추출 -> 개수 계산
        // filter(): 스트림 내 원소 중 특정 조건에 해당하는 원소의 값만 추출하여 반환
        // count(): 개수 반환

        // i가 클 경우 개수를 구하기
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
