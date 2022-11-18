package homework_lesson_4;

import java.util.Scanner;

public class TaskArray_3 {
    private static final int AR_NUM = 10;
    public static void main(String[] args) {
        int[] numArray = new int[AR_NUM];
        String[] strArray = new String[AR_NUM];
        for (int i = 0; i < AR_NUM; i++) {  //инициализация массива
            strArray[i] = "Пустая строка";
        }
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < AR_NUM) {
            System.out.print("Введите " + (count + 1) + " строку : ");
            strArray[count] = scanner.nextLine();
            numArray[count] = strArray[count].length();
            count++;
        }
        for (int i = 0; i < AR_NUM; i++) {
            System.out.println(" ячейка массива " + (i + 1)+ " содержимое ячейки " + strArray[i] + " длина " + numArray[i]);
        }
    }
}
