import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // split(): 문자열을 분리하여 배열에 저장 후 반환
        String[] str = a.split("");

        for (int i = 0; i < str.length; i++) {
            // 배열의 원소를 출력하기
            System.out.println(str[i]);
        }
    }
}
