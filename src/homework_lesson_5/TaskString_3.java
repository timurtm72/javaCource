package homework_lesson_5;

import java.util.Scanner;

public class TaskString_3 {
    private static int AR_NUM = 10;

    public static void main(String[] args) {
        String str = null;
        String[] arStr = new String[AR_NUM];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 8 строк в консоли...");
        System.out.println();
        for (int i = 0; i < AR_NUM - 2; i++) {
            System.out.print("Введите " + i + " строку : ");
            str = scanner.nextLine();
            arStr[i] = str;
        }
        System.out.println();
        for (int i = AR_NUM - 1; i >= 0; i--) {
            System.out.println(i + " cтрока массива " + arStr[i]);
        }
    }
}

