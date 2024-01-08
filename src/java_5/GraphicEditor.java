package java_5;

import java.util.Scanner;

class GraphicEditor {
    private Shape head, tail;
    private Scanner scanner;
    public void play() {
        scanner = new Scanner(System.in);

        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int input = scanner.nextInt();
            if (input == 4) {
                System.out.println("beauty을 종료합니다.");
                break;
            }
            switch (input){
                case 1:
                    insertMethod();
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >>");
                    int deleteInput = scanner.nextInt();
                    delete(deleteInput);
                    break;
                case 3:
                    print();
                    break;
            }
        }
    }
    void insertMethod(){
        Shape s;
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int insertInput = scanner.nextInt();

            if (insertInput == 1){
                s = new Line();
            }
            else if (insertInput == 2){
                s = new Rect();
            }
            else {
                s = new Circle();
            }

        if (head == null){
            head = s;
            tail = s;
        }
        else {
            tail.setNext(s);
            tail = s;
        }
    }
    void delete(int num){
        Shape cur = head;
        Shape tmp = head;
        int i;
        if (num == 1){
            if (head == tail){
                head = null;
                tail = null;
                return;
            }
            else {
                head = head.getNext();
                return;
            }
        }
        for (i=1; i<num; i++){
            tmp = cur;
            cur = cur.getNext();
            if (cur == null){
                System.out.println("삭제할 수 없습니다.");
                return;
            }
        }
        tmp.setNext(cur.getNext());
    }
    void print() {
        Shape s = head;
        while(s != null) {
            s.draw();
            s = s.getNext();
        }
    }
}


