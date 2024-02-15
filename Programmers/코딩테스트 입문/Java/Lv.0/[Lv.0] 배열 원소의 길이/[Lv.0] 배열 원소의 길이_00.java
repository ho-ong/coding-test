class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            // 배열의 원소의 길이
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
