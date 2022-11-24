package homework_lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку " + (i + 1));
            String str = scanner.nextLine();
            strList.add(0,str);
        }
        int count = 0;
        for (String str : strList) {
            count++;
            System.out.println("Строка " + count + " " + "\'" +  str +  "\'" + " размером " + str.length());
        }
    }
}
