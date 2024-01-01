class Solution {
    public int solution(String str1, String str2) {
        // str1 안에 str2가 있을 경우 1, 없을 경우 2
        return str1.contains(str2) ? 1 : 2;
    }
}
