import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 높이와 너비가 n인 직각 이등변 삼각형
        for (int i = 1; i <= n; i++) {
            // *을 i번 반복하기
            System.out.println("*".repeat(i));
        }
    }
}
