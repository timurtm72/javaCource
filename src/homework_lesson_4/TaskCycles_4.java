package homework_lesson_4;

import java.util.Scanner;

public class TaskCycles_4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число  = ");
            int number = scanner.nextInt();
            sum += number;
            if (number == -1) {
                System.out.println("Вы ввели - 1 и сумма чисел = " + (sum + 1) );
                break;
            }
        }
    }
}
