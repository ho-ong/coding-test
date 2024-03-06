import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // toCharArray(): 문자열을 char형 문자로 분리하고, char[] 배열에 순서대로 저장
        // 문자열 a를 char형 문자로 분리하고, char[] 배열에 순서대로 저장 -> 문자 c로 변환
        // "abcde" -> ['a', 'b', 'c', 'd', 'e'] -> 'a'
        for (char c : a.toCharArray()) {
            // 문자 c를 출력하기 (줄 바꿈)
            System.out.println(c);
        }
    }
}
