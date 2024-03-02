import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // printf("출력서식", 출력내용): 서식 지정 출력 (줄 바꿈 X)
        // 출력서식과 출력내용의 순서 중요
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
