package homework_lesson_5;

import java.util.Scanner;

public class TaskString_2 {
    private static int AR_NUM = 5;

    public static void main(String[] args) {
        String str = null;
        String[] arStr = new String[AR_NUM];
        int[] lenStr = new int[AR_NUM];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 строк в консоли...");
        System.out.println();
        for (int i = 0; i < AR_NUM; i++) {
            System.out.print("Введите " + i + " строку : ");
            str = scanner.nextLine();
            arStr[i] = str;
            lenStr[i] = str.length();
        }
        System.out.println();
        for (int i = 0; i < AR_NUM; i++) {
            System.out.println(i + " cтрока массива " + arStr[i] + " длина строки " + lenStr[i]);
        }
        System.out.println();
        System.out.println("Самая длинная строка массива " + arStr[getMaxAndMin(lenStr)[2]] + " ее длина равна " + arStr[getMaxAndMin(lenStr)[2]].length() + " символов...");
        System.out.println("Самая короткая строка массива " + arStr[getMaxAndMin(lenStr)[3]] + " ее длина равна " + arStr[getMaxAndMin(lenStr)[3]].length() + " символов...");
    }

    public static int[] getMaxAndMin(int[] items) {
        int max = items[0];
        int min = items[0];
        int indMax = 0, indMin = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[i] > max) {
                max = items[i];
                indMax = i;
            } else if (items[i] < min) {
                min = items[i];
                indMin = i;
            }
        }
        return new int[]{max, min,indMax,indMin};
    }
}