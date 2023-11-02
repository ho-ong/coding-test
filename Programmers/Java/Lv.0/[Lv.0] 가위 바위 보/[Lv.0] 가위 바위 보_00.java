class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] str = rsp.split("");

        for (int i = 0; i < rsp.length(); i++) {
            if (str[i].equals("0")) {
                answer += "5"; // 0 -> 5
            } else if (str[i].equals("2")) {
                answer += "0"; // 2 -> 0
            } else if (str[i].equals("5")) {
                answer += "2"; // 5 -> 2
            } else {
                answer = answer;
            }
        }

        return answer;
    }
}
