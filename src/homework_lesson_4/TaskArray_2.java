package homework_lesson_4;

import java.util.Scanner;

public class TaskArray_2 {
        static final int AR_NUM = 10;
        public static void main(String[] args) {
            int[] array = new int[AR_NUM];
            Scanner scanner = new Scanner(System.in);
            int count = 0, max = 0;
            while (count < AR_NUM) {
                System.out.print("Введите " + (count + 1) + " число  = ");
                array[count] = scanner.nextInt();
                count++;
            }

            System.out.println();
            System.out.println("Максимальное число " + getMaxAndMin(array)[0]);

        }
    public static int[] getMaxAndMin(int[] items) {
        int max = items[0];
        int min = items[0];
        for (int i = 1; i < items.length; i++) {
            if (items[i] > max) {
                max = items[i];
            } else if (items[i] < min) {
                min = items[i];
            }
        }
        return new int[]{max, min};
    }
}
