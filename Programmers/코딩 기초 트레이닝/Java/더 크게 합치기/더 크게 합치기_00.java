class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): Integer 클래스의 객체 반환 (parseInt()를 호출하는 형태)

        String ab = String.valueOf(a) + String.valueOf(b); // "9" + "91" = "991"
        String ba = String.valueOf(b) + String.valueOf(a); // "91" + "9" = "919"

        // ab 합 >= ba 합
        // 991 >= 919
        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab); // 991
        } else {
            return Integer.parseInt(ba); // 919
        }
    }
}
