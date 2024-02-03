class Solution {
    public String solution(String my_string, String letter) {
        // replace(target, replacement): 문자열을 다른 문자열로 치환
        // replaceAll(regex, replacement): replace()와 비슷하나, 첫 번째 인자가 정규식
        // replaceFirst(target, replacement): 첫 번째 발견되는 target만 치환
        return my_string.replace(letter, "");
    }
}
