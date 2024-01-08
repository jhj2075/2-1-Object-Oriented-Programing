package java_4;

import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true){
            System.out.print("한글 단어?");
            String input = s.next();
            if(input.equals("그만")) break;
            String eng = Dictionary.kor2Eng(input);
            if(eng.equals("null"))
                System.out.println(input + "은(는) 저의 사전에 없습니다");
            else
                System.out.println(eng);
        }
        s.close();
    }
}
