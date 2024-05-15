class Solution {
    // 팩토리얼 함수
    public int fac(int num) {
        // num이 1보다 클 경우
        if (num > 1) {
            return fac(num - 1) * num;
        } else {
            // num이 1일 경우 1
            return num;
        }
    }

    public int solution(int n) {
        int answer = 0;

        // 팩토리얼 구하기
        for (int i = 1; i <= 10; i++) {
            // n이 i!보다 크거나 같을 경우
            // 3628800 >= 10!
            if (n >= fac(i)) {
                answer = i;
            } else {
                break;
            }
        }

        return answer;
    }
}
