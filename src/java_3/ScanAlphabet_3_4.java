package java_3;

import java.util.Scanner;

public class ScanAlphabet_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        char c;

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        s = scanner.next();
        c = s.charAt(0);

        for (int i = 0; i <= c - 'a'; i++){
            for (char j = 'a'; j <= c - i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
