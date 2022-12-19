package homework_lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку " + (i + 1));
            strList.add(scanner.nextLine());
        }
        System.out.println();
        System.out.println("Размер списка строк равен " + strList.size());
        System.out.println();
        int count = 0;
        for (String str : strList) {
            count++;
            System.out.println("Строка " + count + " содержит " + "\'" + str + "\'");
        }
    }
}
