package java_7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PointManager {
    public static void main(String[] args) {
        HashMap<String, Integer> customer = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("** 포인트 관리 프로그램입니다 **");

        while(true){
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if (name.equals("그만")) break;
            int point = scanner.nextInt();

            if (customer.get(name) == null){
                customer.put(name, point);
            }
            else{
                customer.put(name, customer.get(name) + point);
            }

            Set<String> keys = customer.keySet();
            Iterator<String> it = keys.iterator();

            while(it.hasNext()){
                String printName = it.next();
                int printPoint = customer.get(printName);
                System.out.print("(" + printName + "," + printPoint + ")");
            }
            System.out.println();
        }
    }
}
