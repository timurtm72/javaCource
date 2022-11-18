package homework_lesson_4;

import java.util.Scanner;

public class TaskCycles_3 {
    private static final int AR_NUM = 3;
    public static void main(String[] args) {
        int[] array = new int[AR_NUM];
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;
        while (count < AR_NUM) {
            System.out.print("Введите " + (count + 1) + " число  = ");
            array[count] = scanner.nextInt();
            sum += array[count];
            count++;
        }
        if (sum / AR_NUM == array[0]) {
            System.out.println("Все члены массива равны и значение = " + array[0]);
        } else {
            System.out.println("Максимальное число " + getMaxAndMin(array)[0] + " Минимальное число " + getMaxAndMin(array)[1]);
            System.out.println("Среднее число число " + (sum - (getMaxAndMin(array)[0] + getMaxAndMin(array)[1])));
        }
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
