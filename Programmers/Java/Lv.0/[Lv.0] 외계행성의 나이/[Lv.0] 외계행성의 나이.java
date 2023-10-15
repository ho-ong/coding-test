class Solution {
    public String solution(int age) {
        String answer = "";
        String planet = String.valueOf(age);
        String[] str = planet.split("");

        for (int i = 0; i < planet.length(); i++) {
            answer += (char) (Integer.parseInt(str[i]) + 97);
        }

        return answer;
    }
}
