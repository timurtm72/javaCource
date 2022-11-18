package homework_lesson_5;

import java.util.Scanner;

public class TaskString_4 {
    private static int AR_NUM = 10;

    public static void main(String[] args) {
        String[] arStr = new String[AR_NUM];
        int[] numberArr = new int[AR_NUM];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 строк в консоли...");
        System.out.println();

        for (int i = 0; i < AR_NUM; i++) {
            System.out.print("Введите " + i + " строку : ");
            arStr[i] = scanner.nextLine();
            numberArr[i] = arStr[i].length();
        }
        System.out.println();

        for (int i = 0; i < AR_NUM; i++) {
            System.out.println(i + " cтрока массива " + arStr[i] + " длина строки равна " + numberArr[i]);
        }
    }
}
