class Solution {
    public String solution(String rsp) {
        String answer = "";

        // split(): 문자열 분리
        // 문자열 rsp를 "" 기준으로 분리하고, str 배열에 순서대로 저장
        // "2" -> ["2"]
        String[] str = rsp.split("");

        for (int i = 0; i < rsp.length(); i++) {
            // str 배열의 원소가 "0"일 경우 "5"
            if (str[i].equals("0")) {
                answer += "5";
            // str 배열의 원소가 "2"일 경우 "0"
            } else if (str[i].equals("2")) {
                answer += "0";
            // str 배열의 원소가 "5"일 경우 "2"
            } else if (str[i].equals("5")) {
                answer += "2";
            }
        }

        // "2" -> "0"
        return answer;
    }
}
