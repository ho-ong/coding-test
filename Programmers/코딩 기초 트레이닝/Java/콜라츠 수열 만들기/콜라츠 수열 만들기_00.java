class Solution {
    public int[] solution(int n) {
        String s = n + " ";

        // n이 1이 아닐 경우
        while (n != 1) {
            // 짝수일 경우 n / 2, 홀수일 경우 n * 3 + 1
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            s += n + " ";
        }

        String[] str = s.split(" ");
        int[] answer = new int[str.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}
