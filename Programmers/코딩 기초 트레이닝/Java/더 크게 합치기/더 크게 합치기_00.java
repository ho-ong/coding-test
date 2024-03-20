class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): Integer 클래스의 객체 반환 (parseInt()를 호출하는 형태)

        // a + b -> "9" + "91" = "991"
        String ab = String.valueOf(a) + String.valueOf(b);
        // b + a -> "91" + "9" = "919"
        String ba = String.valueOf(b) + String.valueOf(a);

        // ab가 ba보다 크거나 같을 경우 ab, 아닐 경우 ba
        // 991 >= 919 -> 991
        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab); // 991
        } else {
            return Integer.parseInt(ba); // 919
        }
    }
}
