import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 짝수, 홀수
        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}
