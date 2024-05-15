class Solution {
    public int solution(int[] num_list) {
        String even = ""; // 짝수
        String odd = ""; // 홀수

        // Integer.parseInt(): 정수로 변환
        // String.valueOf(): 문자열로 변환

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): Integer 클래스의 객체 반환 (parseInt()를 호출하는 형태)

        for (int i = 0; i < num_list.length; i++) {
            // num_list 배열의 원소를 2로 나눴을 때, 나머지가 0일 경우
            if (num_list[i] % 2 == 0) {
                // num_list 배열의 원소 중 짝수만 합치기
                even += String.valueOf(num_list[i]);
            } else {
                // num_list 배열의 원소 중 홀수만 합치기
                odd += String.valueOf(num_list[i]);
            }
        }

        // 홀수와 짝수를 더하기
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
