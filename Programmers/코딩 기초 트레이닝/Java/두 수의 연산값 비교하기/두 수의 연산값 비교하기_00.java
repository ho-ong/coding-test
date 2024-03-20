class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): Integer 클래스의 객체 반환 (parseInt()를 호출하는 형태)

        int sum = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); // "2" + "91" = "291" -> 291
        int mul = 2 * a * b; // 2 * 2 * 91 = 364

        // 합 >= 곱
        // 291 >= 364
        if (sum >= mul) {
            return sum; // 291
        } else {
            return mul; // 364
        }
    }
}
