package homework_lesson_3;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число = ");
            double number = scanner.nextDouble();
            if (number > 0) {
                number += 2;
            } else if (number < 0) {
                number += 1;
            } else if (number == 0) {
                number = 0;
            }
            System.out.println("Результат = " + number);
        }
    }
}
