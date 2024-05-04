class Solution {
    public int solution(int n, String control) {
        int answer = n;

        // split(): 문자열 분리
        // 문자열 control을 "" 기준으로 분리하고, str 배열에 순서대로 저장
        String[] str = control.split("");

        for (int i = 0; i < str.length; i++) {
            // str 배열의 원소가 "w"일 경우 +1
            if (str[i].equals("w")) {
                answer += 1;
            // str 배열의 원소가 "s"일 경우 -1
            } else if (str[i].equals("s")) {
                answer -= 1;
            // str 배열의 원소가 "d"일 경우 +10
            } else if (str[i].equals("d")) {
                answer += 10;
            // str 배열의 원소가 "a"일 경우 -10
            } else if (str[i].equals("a")) {
                answer -= 10;
            }
        }

        return answer;
    }
}
