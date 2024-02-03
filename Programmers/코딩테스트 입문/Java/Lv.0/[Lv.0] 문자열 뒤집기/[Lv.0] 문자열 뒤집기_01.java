class Solution {
    public String solution(String my_string) {
        // StringBuilder(): String을 만드는 객체 (가변적, 성능 우수)
        // 기존의 데이터를 참조하여 문자의 삽입, 삭제, 반전 등을 수행
        // 사용 후 String으로 변환 필요 -> toString()
        return new StringBuilder(my_string).reverse().toString();
    }
}
