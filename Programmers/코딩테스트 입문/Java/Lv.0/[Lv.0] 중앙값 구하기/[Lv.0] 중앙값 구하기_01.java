import java.util.*;

class Solution {
    public int solution(int[] array) {
        // array 배열 오름차순 정렬
        Arrays.sort(array);

        // 시프트 연산: <<, >>, >>>
        // x << y: x의 각 비트를 y만큼 좌측으로 이동, 빈자리는 0으로 채워진다. (x * 2(y²))
        // x >> y: x의 각 비트를 y만큼 우측으로 이동, 빈자리는 최상위 부호비트(양수 0, 음수 1)로 채워진다. (x / 2(y²))
        // x >>> y: x의 각 비트를 y만큼 우측으로 이동, 빈자리는 0으로 채워진다. (x / 2(y²))
        // 10진수 8 -> 2진수 00001000 (앞부분 0)
        // 10진수 -8 -> 2진수 11111000 (앞부분 1)

        // 중앙값 = 배열의 길이의 각 비트를 1만큼 우측으로 이동시킨 값
        return array[array.length >> 1];
    }
}
