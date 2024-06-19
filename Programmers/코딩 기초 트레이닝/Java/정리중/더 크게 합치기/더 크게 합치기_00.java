class Solution {
    public int solution(int a, int b) {
        // String.valueOf(): 문자열 변환
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        // Integer.parseInt(): 정수 변환
        // ab가 ba보다 크거나 같을 경우 ab, 아닐 경우 ba
        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }
    }
}
