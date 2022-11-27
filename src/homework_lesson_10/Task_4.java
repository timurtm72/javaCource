package homework_lesson_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку " + i);
            String str = scanner.nextLine();
            strList.add(str);
        }
        printStringList(doubleValues(strList));
    }
    public static ArrayList<String> doubleValues(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(strings);
        for (int i = 0; i < strings.size(); i++) {
            list.add(2 * i + 1,strings.get(i));
        }
        return list;
    }
    public static void printStringList(ArrayList<String> strings){
        int count = 0;
        System.out.println();
        for (String strVal : strings) {
            System.out.println("Строка " + count++ + " " + "\'" +  strVal +  "\'" + " размером " + strVal.length());
        }
        System.out.println();
    }
}
