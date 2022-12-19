package homework_lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку " + (i + 1));
            String str = scanner.nextLine();
            strList.add(str);
        }
        for (int i = 0; i < 13; i++) {
            String tmpStr = strList.get(strList.size() - 1);
            strList.remove(strList.size() - 1);
            strList.add(0,tmpStr);
        }
        int count = 0;
        for (String str : strList) {
            count++;
            System.out.println("Строка " + count + " " + "\'" +  str +  "\'" + " размером " + str.length());
        }

    }
}
