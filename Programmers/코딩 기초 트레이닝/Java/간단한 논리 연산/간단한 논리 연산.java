class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // 논리연산자: &&(and), ||(or), !(not)
        // ∧ = &&(and), ∨ = ||(or)

        // (x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (F ∨ T) ∧ (T ∨ T) ≡ T ∧ T ≡ T
        // (false || true) && (true || true) = true && true = true
        boolean answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}
