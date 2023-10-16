class Solution {
    public String solution(int age) {
        String answer = "";
        String planet = String.valueOf(age);
        String[] str = planet.split("");

        for (int i = 0; i < planet.length(); i++) {
            // + 97 : 아스키 코드 변환
            // char 문자 변환
            answer += (char) (Integer.parseInt(str[i]) + 97);
        }

        return answer;
    }
}
