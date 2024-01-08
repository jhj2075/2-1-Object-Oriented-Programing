package java_4;

import java.util.Scanner;

class Booking {
    public static void main(String[] args) {
        Book b = new Book();
        Scanner s = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int input = s.nextInt();
            if(input == 4) break;
            switch (input){
                case 1:
                    b.chooseSeat();
                    break;
                case 2:
                    b.printSeat();
                    break;
                case 3:
                    b.delete();
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
        s.close();
    }
}
