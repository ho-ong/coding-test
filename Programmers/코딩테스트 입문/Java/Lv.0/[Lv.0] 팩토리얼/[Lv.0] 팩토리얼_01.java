class Solution {
    // 팩토리얼 함수
    public int fac(int num) {
        // num이 1보다 클 경우
        if (num > 1) {
            // 1 * 2, 1 * 2 * 3, ...
            return fac(num - 1) * num;
        } else {
            return num;
        }
    }

    public int solution(int n) {
        int answer = 0;

        // 최대 팩토리얼 10까지 반복하기
        for (int i = 1; i <= 10; i++) {
            // n이 fac보다 크거나 같을 경우
            if (n >= fac(i)) {
                answer = i;
            } else {
                break;
            }
        }

        return answer;
    }
}
