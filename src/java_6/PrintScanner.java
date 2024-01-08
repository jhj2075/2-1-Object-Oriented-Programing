package java_6;

import java.util.Scanner;

public class PrintScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String ScanString = scanner.nextLine();

        for (int i = 1; i <= ScanString.length(); i++){
            System.out.print(ScanString.substring(i));
            System.out.println(ScanString.substring(0, i));
        }
        scanner.close();
    }
}
