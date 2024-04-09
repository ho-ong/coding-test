import java.util.*;

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

        String answer = "";

        // split(): 문자열 분리
        // 문자열 letter를 " " 기준으로 분리하고, str 배열에 순서대로 저장
        // ".... . .-.. .-.. ---" -> ["....", ".", ".-..", ".-..", "---"]
        String[] str = letter.split(" ");

        for (String s : str) {
            // 문자열 s와 일치하는 map의 키를 찾고, 키의 값을 합치기
            // "....", ".", ".-..", ".-..", "---" -> "h", "e", "l", "l", "o" -> "hello"
            answer += map.get(s);
        }

        return answer;
    }
}
