import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // concat(): 문자열 연결
        // 문자열 a와 문자열 b를 연결 (apple pen -> applepen)
        System.out.println(a.concat(b));
    }
}
