package java_7;

import java.util.Scanner;
import java.util.Vector;

public class Rainfall {
    public static void main(String[] args) {
        Vector<Integer> rainfall = new Vector<>();
        Scanner scanner = new Scanner(System.in);


        while (true){
            int sum = 0;
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int input = scanner.nextInt();
            rainfall.add(input);

            if(input == 0) break;

            for (int i = 0; i < rainfall.size(); i++){
                System.out.print(rainfall.get(i)+ " ");
                sum += rainfall.get(i);
            }
            System.out.println();
            System.out.println("현재 평균 " + sum / rainfall.size());
        }
        scanner.close();
    }
}
