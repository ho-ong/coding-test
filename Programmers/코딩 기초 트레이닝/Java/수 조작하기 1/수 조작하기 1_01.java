class Solution {
    public int solution(int n, String control) {
        int answer = n;

        // toCharArray(): 문자열을 char형 문자로 분리하고, char[] 배열에 순서대로 저장
        // 문자열 control을 char형 문자로 분리하고, char[] 배열에 순서대로 저장 -> 문자 c로 변환
        for (char c : control.toCharArray()) {
            switch (c) {
                // 문자 c가 'w'일 경우 +1
                case 'w':
                    answer += 1;
                    break;
                // 문자 c가 's'일 경우 -1
                case 's':
                    answer -= 1;
                    break;
                // 문자 c가 'd'일 경우 +10
                case 'd':
                    answer += 10;
                    break;
                // 문자 c가 'a'일 경우 -10
                case 'a':
                    answer -= 10;
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}
