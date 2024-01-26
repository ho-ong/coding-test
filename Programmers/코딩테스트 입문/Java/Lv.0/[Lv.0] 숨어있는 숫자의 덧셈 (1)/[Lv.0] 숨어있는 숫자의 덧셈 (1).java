class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // [a-zA-Z] : a부터 z까지 or A부터 Z까지
        String s = my_string.replaceAll("[a-zA-Z]", "");
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            answer += Integer.valueOf(str[i]);
        }

        return answer;
    }
}
