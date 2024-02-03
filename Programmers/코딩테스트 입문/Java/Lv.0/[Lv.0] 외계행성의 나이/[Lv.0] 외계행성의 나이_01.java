class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while (age > 0) {
            // + 'a': 아스키 코드 변환
            // char 문자 변환
            sb.insert(0, (char) (age % 10 + (int) 'a'));
            age /= 10;
        }

        return sb.toString();
    }
}
