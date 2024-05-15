class Solution {
    public int solution(double flo) {
        // 캐스팅 데이터 타입을 변환하는 과정
        // 암시적 캐스팅: 작은 -> 큰 크기의 데이터 타입으로 변환 (데이터 손실 발생 X, 자동 실행)
        // 명시적 캐스팅: 큰 -> 작은 크기의 데이터 타입으로 변환 (데이터 손실 발생 O, 타입 명시 시 실행)
        return (int) flo;
    }
}
