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
        String[] str = letter.split(" ");

        for (String morse : str) {
            // map의 키에 해당하는 값을 가져와 합치기
            answer += map.get(morse);
        }

        return answer;
    }
}
