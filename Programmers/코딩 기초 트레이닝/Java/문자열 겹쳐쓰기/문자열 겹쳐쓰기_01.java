class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 기본 문자열 + 겹쳐 쓸 문자열 + 나머지 문자열 (my_string + overwrite_string + my_string)

        // substring(): 문자열 자르기
        // 문자열 my_string 내 인덱스 0(포함)부터 s(불포함)까지 위치한 문자열을 자르기
        // "He11oWor1d" -> "He"

        // 이후 문자열 overwrite_string을 합치기
        // "He" + "lloWorl" -> "HelloWorl"

        // 문자열 my_string 내 인덱스 9(포함)부터 위치한 문자열을 합치기
        // "He11oWor1d" -> "d"
        // "HelloWorl" + "d" -> "HelloWorld"
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}
