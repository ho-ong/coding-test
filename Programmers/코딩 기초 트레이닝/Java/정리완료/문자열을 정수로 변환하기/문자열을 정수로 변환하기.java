class Solution {
    public int solution(String n_str) {
        // Integer.parseInt(): 정수 변환
        return Integer.parseInt(n_str);

        // Integer.valueOf(): 정수 변환
        // return Integer.valueOf(n_str);

        // Integer.parseInt()와 Integer.valueOf()의 차이?
        // Integer.parseInt(): 기본형 int 반환
        // Integer.valueOf(): 참조형 new Integer() 반환 => new Integer(Integer.parseInt())
    }
}
