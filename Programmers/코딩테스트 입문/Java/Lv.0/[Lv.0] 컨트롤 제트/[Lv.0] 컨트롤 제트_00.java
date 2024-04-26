class Solution {
    public int solution(String s) {
        int answer = 0;

        // split(): 문자열 분리
        // 문자열 s를 " " 기준으로 분리하고, str 배열에 순서대로 저장
        // "1 2 Z 3" -> ["1", "2", "Z", "3"]
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            // str 배열의 원소가 "Z"일 경우
            if (str[i].equals("Z")) {
                // Integer.parseInt(): 정수로 변환
                // str 배열의 원소를 정수로 변환하여 빼기 ("Z" 전에 더한 str 배열의 원소)
                // ["1", "2", "Z", "3"] -> [1, 2, 3]
                // 3 - 2 = 1
                answer -= Integer.parseInt(str[i - 1]);
            } else {
                // str 배열의 원소를 정수로 변환하여 더하기
                // ["1", "2", "Z", "3"] -> [1, 2, 3]
                // 1 + 2 = 3
                // 1 + 3 = 4 ("Z" 전의 str 배열의 원소는 빼기)
                answer += Integer.parseInt(str[i]);
            }
        }

        return answer;
    }
}
