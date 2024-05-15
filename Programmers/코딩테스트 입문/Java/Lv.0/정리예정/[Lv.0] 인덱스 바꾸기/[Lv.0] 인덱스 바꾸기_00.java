class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] str = my_string.split("");
        String answer = str[num1];
        str[num1] = str[num2]; // 인덱스 num2로 변경
        str[num2] = answer; // 인덱스 num1로 변경
        return String.join("", str);
    }
}
