class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt() : 정수 변환
        // String.valueOf() : 문자열 변환
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }
    }
}
