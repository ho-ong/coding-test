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

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
                // 문자열 my_string 내 인덱스 i에 위치한 문자열을 문자로 변환

                // append(): 문자열 추가
                // 문자열 my_string의 문자를 j번(n까지) 반복하여 sb에 추가하기
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
