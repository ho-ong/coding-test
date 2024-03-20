import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // repeat(): 문자열 반복
        // 문자열 str을 n번 반복
        // string 5 -> stringstringstringstringstring
        System.out.println(str.repeat(n));
    }
}
