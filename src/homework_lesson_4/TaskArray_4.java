package homework_lesson_4;

import java.util.Scanner;

public class TaskArray_4 {
    private static final int AR_NUM = 10;

    public static void main(String[] args) {
        int[] array = new int[AR_NUM];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < AR_NUM) {
            System.out.print("Введите " + (count + 1) + " число  = ");
            array[count] = scanner.nextInt();
            count++;
        }
        System.out.println();
        for (int i = AR_NUM - 1; i >= 0; i--) {
            System.out.println((i + 1) + " ячейка = " + array[i] );
        }
    }
}
