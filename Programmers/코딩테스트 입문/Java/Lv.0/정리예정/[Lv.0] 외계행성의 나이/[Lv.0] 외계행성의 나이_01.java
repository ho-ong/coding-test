class Solution {
    public String solution(int age) {
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

        while (age > 0) {
            // ASCII 코드 변환 (0-9 = 48-57, A-Z = 65-90, a-z = 97-122)
            // 정수 -> 문자 변환 (char), 문자 -> 정수 변환 (int)

            // insert(index, string): 지정한 인덱스에 문자열 삽입
            // 인덱스 0에 문자 'd', 'c'를 삽입하기
            sb.insert(0, (char) (age % 10 + (int) 'a'));
            age /= 10;

            // age % 10, age / 10 하는 이유?
            // 정수를 1의 자릿수로 분리하기 위한 과정
            // age / 10 -> 10의 자릿수를 1의 자릿수로 변환 (몫)
            // age % 10 -> 1의 자릿수로 분리 (나머지)
            // 23을 3, 2로 분리할 수 있다.
        }

        return sb.toString();
    }
}
