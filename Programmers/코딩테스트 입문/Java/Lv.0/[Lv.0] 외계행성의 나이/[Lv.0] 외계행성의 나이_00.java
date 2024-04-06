class Solution {
    public String solution(int age) {
        String answer = "";

        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): Integer 클래스의 객체 반환 (parseInt()를 호출하는 형태)

        // 23 -> "23"
        String s = String.valueOf(age);

        // split(): 문자열 분리
        // 문자열 s를 "" 기준으로 분리하고, str 배열에 순서대로 저장
        // "23" -> ["2", "3"]
        String[] str = s.split("");

        for (int i = 0; i < s.length(); i++) {
            // ASCII 코드 변환 (0-9 = 48-57, A-Z = 65-90, a-z = 97-122)
            // 정수 -> 문자 변환 (char), 문자 -> 정수 변환 (int)

            // str 배열의 원소를 ASCII 코드로 변환하여 합치기
            // "2", "3" -> 2, 3 -> 'c', 'd' -> "cd"
            answer += (char) (Integer.parseInt(str[i]) + 97);
        }

        return answer;
    }
}
