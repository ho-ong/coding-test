import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String letter) {
        // map 생성 (키, 값 저장)
        Map<String, String> map = new HashMap<>() {{
            put(".-", "a");
            put("-...", "b");
            put("-.-.", "c");
            put("-..", "d");
            put(".", "e");
            put("..-.", "f");
            put("--.", "g");
            put("....", "h");
            put("..", "i");
            put(".---", "j");
            put("-.-", "k");
            put(".-..", "l");
            put("--", "m");
            put("-.", "n");
            put("---", "o");
            put(".--.", "p");
            put("--.-", "q");
            put(".-.", "r");
            put("...", "s");
            put("-", "t");
            put("..-", "u");
            put("...-", "v");
            put(".--", "w");
            put("-..-", "x");
            put("-.--", "y");
            put("--..", "z");
        }};

        // 배열 스트림 생성 -> map -> 문자열 병합
        // map(): 스트림 내 기존 원소를 새로운 원소로 매핑하여 반환
        // collect(): 스트림 내 원소를 변형 및 처리, List, Set 등의 자료형으로 변환
        // collect(Collectors.joining()): 스트림 내 문자열 병합

        // split(): 문자열 분리
        // 문자열 letter를 " " 기준으로 분리하고, 배열에 순서대로 저장
        // ".... . .-.. .-.. ---" -> ["....", ".", ".-..", ".-..", "---"]

        // 분리한 문자열 letter와 일치하는 map의 키를 찾고, 키의 값을 합치기
        // "....", ".", ".-..", ".-..", "---" -> "h", "e", "l", "l", "o" -> "hello"
        return Arrays.stream(letter.split(" ")).map(map::get).collect(Collectors.joining());
    }
}
