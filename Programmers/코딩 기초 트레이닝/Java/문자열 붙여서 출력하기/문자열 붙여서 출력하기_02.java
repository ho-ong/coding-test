import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // join(): 문자열 병합
        // 문자열 a와 문자열 b를 공백없이 병합
        System.out.println(String.join("", a, b));
    }
}
