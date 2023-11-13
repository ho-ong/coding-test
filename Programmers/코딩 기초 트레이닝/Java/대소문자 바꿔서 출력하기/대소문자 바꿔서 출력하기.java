import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i); 

            // isUpperCase(), isLowerCase() : 대소문자 여부 확인 후 True, False 반환
            if (Character.isLowerCase(c)) {
                // toUpperCase() : 대문자 변환
                answer += Character.toUpperCase(c);
            } else {
                // toLowerCase() : 소문자 변환
                answer += Character.toLowerCase(c);
            }
        }

        System.out.println(answer);
    }
}
