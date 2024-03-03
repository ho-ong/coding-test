import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // split(): 문자열 분리
        // 문자열 a를 "" 기준으로 분리하고, str 배열에 순서대로 저장 ("abcde" -> ["a", "b", "c", "d", "e"])
        String[] str = a.split("");

        for (int i = 0; i < str.length; i++) {
            // str 배열의 원소를 출력하기 (줄 바꿈)
            System.out.println(str[i]);
        }
    }
}
