class Solution {
    public String solution(String my_string) {
        // StringBuilder: 가변한 문자열을 처리하기 위한 클래스 (싱글스레드 환경)
        // 기존의 데이터를 참조하여 문자열 추가, 삽입, 삭제, 반전 등을 수행
        // 사용 후 String으로 변환 필요 -> String.valueOf(), toString()
        // reverse(): 반전 반환

        // 문자열 my_string의 반전 반환
        // "jaron" -> "noraj"
        return new StringBuilder(my_string).reverse().toString();
    }
}
