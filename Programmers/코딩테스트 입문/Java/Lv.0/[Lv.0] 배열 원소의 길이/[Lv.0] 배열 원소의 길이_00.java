class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            // strlist 배열의 원소의 길이를 넣기
            // ["We", "are", "the", "world!"] -> [2, 3, 3, 6]
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
