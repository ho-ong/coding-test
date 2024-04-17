class Solution {
    public int solution(int age) {
        // + 1 하는 이유?
        // 태어난 연도에 이미 1살이므로 + 1을 해야 한다.

        // 2022 - 40 + 1 = 1983
        return 2022 - age + 1;
    }
}
