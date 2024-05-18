import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // 방법 1
        // concat(): 문자열 병합
        System.out.println(a.concat(b));

        // 방법 2
        // join(): 문자열 병합
        // System.out.println(String.join("", a, b));
    }
}
