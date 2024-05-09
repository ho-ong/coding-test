class Solution {
    public int[] solution(int n) {
        // 정수를 문자열로 변환
        // "10 "
        String s = n + " ";

        // n이 1이 아닐 경우
        while (n != 1) {
            // n을 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
            // 짝수일 경우 n / 2, 홀수일 경우 n * 3 + 1
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            s += n + " ";
        }

        // split(): 문자열 분리
        // 문자열 s를 " " 기준으로 분리하고, str 배열에 순서대로 저장
        String[] str = s.split(" ");
        int[] answer = new int[str.length];

        for (int i = 0; i < answer.length; i++) {
            // Integer.parseInt(): 정수로 변환
            // str 배열의 원소를 정수로 변환하여 넣기
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}
