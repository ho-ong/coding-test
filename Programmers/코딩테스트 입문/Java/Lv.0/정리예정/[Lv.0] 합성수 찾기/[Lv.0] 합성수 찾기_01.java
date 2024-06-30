import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 합성수: 약수의 개수가 세 개 이상인 수

        // 기본형 스트림 생성 -> 원소 추출 -> 개수 계산
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수를 순서대로 생성
        // filter(): 스트림 내 원소 중 특정 조건에 해당하는 원소의 값만 추출하여 반환
        // count(): 개수 반환

        // 합성수 구하기
        return (int) IntStream.rangeClosed(1, n).filter(
            // 약수 구하기
            i1 -> (int) IntStream.rangeClosed(1, i1).filter(i2 -> i1 % i2 == 0).count() >= 3
        ).count();
    }
}
