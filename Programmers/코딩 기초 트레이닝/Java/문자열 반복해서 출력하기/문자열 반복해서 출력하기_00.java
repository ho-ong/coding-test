import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String a = "";

        for (int i = 1; i <= n; i++) {
            // 문자열을 모두 합치기
            a += str;
        }

        System.out.println(a);
    }
}
