package homework_lesson_4;

import java.util.Scanner;

public class TaskArray_1 {
    private static final int AR_NUM = 10;
    public static void main(String[] args) {
        String[] strArray = new String[AR_NUM];
        for (int i = 0; i < AR_NUM; i++) {  //инициализация массива
            strArray[i] = "Пустая строка";
        }
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(count < AR_NUM - 2) {
            System.out.print("Введите "+ (count + 1) + " строку : ");
            strArray[count] = scanner.nextLine();
            count++;
        }
        System.out.println();
        for (int i = AR_NUM - 1; i >= 0; i--) {
            System.out.println((i + 1) + " строка массива = " + strArray[i] );
        }
    }
}
