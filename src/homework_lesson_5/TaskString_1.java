package homework_lesson_5;

import java.util.Scanner;

public class TaskString_1 {
    private static  int AR_NUM = 100;

    public static void main(String[] args) {
        int count = 0;
        String str = null;
        String[] arStr = new String[AR_NUM];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите строку : ");
            str = scanner.nextLine();
            if (str.equals("")) {
                count = 0;
                break;
            }
            if (str.length() % 2 == 0) {
                str = str.repeat(2); // выводит строку N количество раз
            } else {
                str = str.repeat(3);
            }
            str = str.toUpperCase();
            arStr[count] = str;
            count++;
        }
        for (int i = 0; i < AR_NUM; i++) {
            if (arStr[i] != null) {
                System.out.print(arStr[i] + " ");
            }
        }
    }
}
