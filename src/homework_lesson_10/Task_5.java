package homework_lesson_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку " + i );
            String str = scanner.nextLine();
            strList.add(str);
            numberList.add(str.length());
        }
        printStringList(strList);
        printNumberList(numberList);
        boolean isFail = false;
        int compareVal = numberList.get(0);
        for (int i = 1; i < numberList.size(); i++) {
            if ( compareVal >= numberList.get(i)) {
                System.out.println("Порядок возрастания нарушен... Индекс элемента равен " + i + " длина строки " + numberList.get(i) + " значение равно " + strList.get(i));
                isFail = true;
                break;
            }else{
                compareVal = numberList.get(i);
            }
        }
        if (!isFail) {
            System.out.println("Порядок возрастания не нарушен...");
        }
    }

    public static void printStringList(ArrayList<String> strings) {
        int count = 0;
        System.out.println();
        for (String strVal : strings) {
            System.out.println("Строка " + ++count + " " + "\'" + strVal + "\'" + " размером " + strVal.length());
        }
        System.out.println();
    }

    public static void printNumberList(ArrayList<Integer> integers) {
        int count = 0;
        System.out.println();
        for (Integer intVal : integers) {
            System.out.println("Ячейка номер " + ++count + " значение " + intVal);
        }
        System.out.println();
    }
}
