import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        System.out.print("2자리수 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);

        int tens, units;
        int input = scanner.nextInt();
        tens = input / 10;
        units = input % 10;

        if(tens == units) {
            System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
            }
        scanner.close();
    }
}