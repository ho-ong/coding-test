class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1; // 팩토리얼

        while (n >= fac) {
            answer++;
            fac *= answer;
            // 1 * 2, 1 * 2 * 3, ...
        }

        return answer - 1;
    }
}
