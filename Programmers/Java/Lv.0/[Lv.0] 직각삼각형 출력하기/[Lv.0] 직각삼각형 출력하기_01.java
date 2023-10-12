import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 높이와 너비가 n인 직각 이등변 삼각형
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // "*"를 j번 반복하기
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
