package homework_lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList1 = new ArrayList<>();
        ArrayList<Integer> numberList2 = new ArrayList<>();
        ArrayList<Integer> numberList3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Введите число " + (i + 1));
            Integer number = scanner.nextInt();
            if(number % 3 == 0 && number % 2 == 0){
                numberList1.add(number);
                numberList2.add(number);
                continue;
            }else if(number % 3 == 0){
                numberList1.add(number);
            }else if(number % 2 == 0){
                numberList2.add(number);
            }else{
                numberList3.add(number);
            }
        }
        printList("Список number % 3 == 0 ", numberList1);
        printList("Список number % 2 == 0 ", numberList2);
        printList("Список остальное ", numberList3);

    }
    public static void printList(String message, ArrayList<Integer> list){
        System.out.println(message);
        int count = 0;
        for (Integer val : list) {
            count++;
            System.out.println(" Ячейка номер " + count + " со значением " + val);
        }
        System.out.println();
    }

}
