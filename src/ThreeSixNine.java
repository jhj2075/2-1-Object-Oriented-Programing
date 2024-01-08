import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args){
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);

        int tens, units;
        int input = scanner.nextInt();
        tens = input / 10;
        units = input % 10;

        if (tens == 3 || tens == 6 || tens == 9){
            if (units == 3 || units == 6 || units == 9) {
                System.out.println("박수짝짝");
            }
            else {
                System.out.println("박수짝");
            }
        }
        else if (units == 3 || units == 6 || units == 9){
                System.out.println("박수짝");
        }
        scanner.close();
    }
}
