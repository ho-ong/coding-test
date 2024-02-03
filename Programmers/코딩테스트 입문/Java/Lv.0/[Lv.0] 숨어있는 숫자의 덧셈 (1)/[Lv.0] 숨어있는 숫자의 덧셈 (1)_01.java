class Solution {
    public int solution(String my_string) {
        // filter(Character::isDigit): Character 클래스 내 숫자 여부를 판단하는 isDigit
        return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }
}
