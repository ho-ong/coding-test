class Solution {
    public String solution(String[] arr) {
        // join(): 문자열 병합
        // arr 배열의 원소를 공백없이 문자열로 변환하여 병합 (["a", "b", "c"] -> "abc")
        return String.join("", arr);
    }
}
