package java_7;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        ArrayList<Character> grade = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for (int i = 0; i < 6; i++){
            String input = scanner.next();
            char c = input.charAt(0);
            grade.add(c);
        }

        for (int i = 0; i < grade.size(); i++){
            char g = grade.get(i);
            if (g == 'A'){
                sum += 4.0;
            }
            else if (g == 'B'){
                sum += 3.0;
            }
            else if (g == 'C'){
                sum += 2.0;
            }
            else if (g == 'D'){
                sum += 1.0;
            }
            else sum += 0.0;
        }
        System.out.println(sum / 6);

        scanner.close();
    }
}
