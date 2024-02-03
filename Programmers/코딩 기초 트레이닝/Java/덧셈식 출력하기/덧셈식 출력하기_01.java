import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // print(): 한 줄 출력 (줄 바꿈 X)
        // println(): 한 줄 출력 (줄 바꿈 O)
        // printf(): 서식 지정 출력
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
