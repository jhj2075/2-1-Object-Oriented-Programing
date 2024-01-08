package java_3;

import java.util.Scanner;

public class RockScissorsPaper_3_16 {
    public static void main(String[] args) {
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true){
            String str[] = {"가위", "바위", "보"};
            int n = (int)(Math.random()*3);

            System.out.print("가위 바위 보!>>");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            if (input.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }

            System.out.print("사용자 = " + input + " , 컴퓨터 = " + str[n]);

            if(str[n].equals("가위")){
                if (input.equals("가위")){
                    System.out.println(", 비겼습니다.");
                }
                else if(input.equals("바위")){
                    System.out.println(", 사용자가 이겼습니다.");
                }
                else System.out.println(", 사용자가 졌습니다.");
            }
            else if(str[n].equals("바위")){
                if (input.equals("가위")){
                    System.out.println(", 사용자가 졌습니다.");
                }
                else if(input.equals("바위")){
                    System.out.println(", 비겼습니다.");
                }
                else System.out.println(", 사용자가 이겼습니다.");
            }
            else{
                if (input.equals("가위")){
                    System.out.println(", 사용자가 이겼습니다.");
                }
                else if(input.equals("바위")){
                    System.out.println(", 사용자가 졌습니다.");
                }
                else System.out.println(", 비겼습니다.");
            }
        }

    }
}
