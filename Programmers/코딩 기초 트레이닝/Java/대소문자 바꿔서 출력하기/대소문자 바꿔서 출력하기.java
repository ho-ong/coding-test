import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            // charAt(): 문자열 내 해당 인덱스에 위치한 문자열을 선택하여 char형 문자로 변환
            // 문자열 a 내 인덱스 i에 위치한 문자열을 문자 c로 변환
            char c = a.charAt(i);

            // isUpperCase(), isLowerCase(): 문자열의 대소문자 여부를 확인하여 true, false 반환
            if (Character.isLowerCase(c)) {
                // toUpperCase(): 문자열 대문자 변환
                // 문자 c가 소문자일 경우 대문자로 변환
                answer += Character.toUpperCase(c);
            } else {
                // toLowerCase(): 문자열 소문자 변환
                // 문자 c가 대문자일 경우 소문자로 변환
                answer += Character.toLowerCase(c);
            }
        }

        System.out.println(answer);
    }
}
