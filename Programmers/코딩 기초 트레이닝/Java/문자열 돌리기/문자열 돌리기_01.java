import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c : a.toCharArray()) {
            // 문자열의 원소를 출력하기
            System.out.println(c);
        }
    }
}
