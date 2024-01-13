class Solution {
    public int solution(int n, String control) {
        // Stream.reduce() : Stream의 요소들을 하나의 데이터로 변환
        // Stream.reduce(accumulator), Stream.reduce(init, accumulator)
        return control.chars().reduce(n, (answer, c) -> answer + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }
}
