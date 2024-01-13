class Solution {
    public int solution(int n, String control) {
        int answer = n;

        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w' : // w : +1
                    answer += 1;
                    break;
                case 's' : // s : -1
                    answer -= 1;
                    break;
                case 'd' : // d : +10
                    answer += 10;
                    break;
                case 'a' : // a : -10
                    answer -= 10;
                    break;
                default :
                    break;
            }
        }

        return answer;
    }
}
