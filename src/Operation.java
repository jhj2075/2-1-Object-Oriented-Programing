import java.util.Scanner;

public class Operation {
    public static void main(String[] args){
        System.out.print("연산>>");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();

        switch (operator){
            case "+":
                System.out.println(num1 + "+" + num2 + "의 계산 결과는 " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + "-" + num2 + "의 계산 결과는 " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + "*" + num2 + "의 계산 결과는 " + (num1 * num2));
                break;
            case "/":
                switch (num2){
                    case 0:
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                }
                System.out.println(num1 + "+" + num2 + "의 계산 결과는 " + (num1 / num2));
                break;
        }
    }
}
