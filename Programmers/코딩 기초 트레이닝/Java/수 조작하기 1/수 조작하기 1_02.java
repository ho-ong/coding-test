class Solution {
    public int solution(int n, String control) {
        // 스트림 변환 -> 원소 연산
        // chars(): 문자열의 문자들을 스트림으로 변환
        // reduce(): 스트림 내 원소들을 연산하여 하나의 값 반환

        // reduce(accumulator), reduce(identity, accumulator)
        // accumulator: 계산 로직 (연산을 수행하는 부분)
        // identity: 초깃값 (스트림이 빈 경우 초깃값 반환)

        // 문자열 control의 문자들을 스트림으로 변환
        // 문자 c가 'w'일 경우 +1, 's'일 경우 -1, 'd'일 경우 +10, 'a'일 경우 -10 연산 수행
        return control.chars().reduce(n, (answer, c) -> answer + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }
}
