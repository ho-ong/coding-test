class Solution {
    public String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            // 문자열의 원소를 모두 합치기
            answer += arr[i];
        }

        return answer;
    }
}
