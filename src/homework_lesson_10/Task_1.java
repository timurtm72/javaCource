package homework_lesson_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку " + i );
            strList.add(scanner.nextLine());
        }
        System.out.println();
        System.out.println("before  strList => " + strList);
        strList.remove(2);
        System.out.println("after  strList => " + strList);
        int count = 0;
        System.out.println();
        for (int i = strList.size() - 1; i >= 0; i--) {
            System.out.println("Строка " + count++ + " " + "\'" +  strList.get(i) +  "\'" + " размером " + strList.get(i).length());
        }
    }
}
