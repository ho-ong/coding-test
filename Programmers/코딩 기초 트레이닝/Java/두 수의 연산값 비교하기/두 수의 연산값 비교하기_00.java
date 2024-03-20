class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): Integer 클래스의 객체 반환 (parseInt()를 호출하는 형태)

        // a + b -> "2" + "91" = "291" -> 291
        int sum = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        // 2 * 2 * 91 = 364
        int mul = 2 * a * b;

        // sum이 mul보다 크거나 같을 경우 sum, 아닐 경우 mul
        // 291 >= 364 -> 364
        if (sum >= mul) {
            return sum; // 291
        } else {
            return mul; // 364
        }
    }
}
