class Solution {
    public String solution(String my_string, int n) {
        // StringBuilder: 가변한 문자열을 처리하기 위한 클래스 (싱글스레드 환경)
        // 기존의 데이터를 참조하여 문자열 추가, 삽입, 삭제, 반전 등을 수행
        // 사용 후 String으로 변환 필요 -> String.valueOf(), toString()
        StringBuilder sb = new StringBuilder();

        // StringBuilder 사용하는 이유?
        // String: 불변한 문자열을 처리하기 위한 클래스 (불변, 새로운 객체로 추가 및 변경)
        // 문자열 연산 시 메모리 할당과 메모리 해제를 발생시키므로 연산이 많을 경우 성능상 좋지 않다.
        // StringBuilder, StringBuffer: 가변한 문자열을 처리하기 위한 클래스 (가변, 기존의 객체로 추가 및 변경)
        // 문자열 연산 시 기존의 데이터에 연산하므로 속도가 빠르고, 상대적으로 부하가 적다.

        // StringBuilder와 StringBuffer의 차이?
        // StringBuidler는 싱글스레드, StringBuffer는 멀티스레드 환경에서 유리하다.

        // toCharArray(): 문자열을 char형 문자로 분리하고, char[] 배열에 순서대로 저장
        // 문자열 my_string을 char형 문자로 분리하고, char[] 배열에 순서대로 저장 -> 문자 c로 변환
        // "hello" -> ['h', 'e', 'l', 'l', 'o'] -> 'h'
        for (char c : my_string.toCharArray()) {
            // 문자 c를 n번 반복하여 sb에 추가하기
            // ['h', 'e', 'l', 'l', 'o'] 3 -> "hhh" -> "hhheeellllllooo"
            sb.append((c + "").repeat(n));
        }

        return sb.toString();
    }
}
