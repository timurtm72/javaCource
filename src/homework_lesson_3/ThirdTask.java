package homework_lesson_3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите год = ");
            boolean isLeapYear = false;
            double yearNumber = scanner.nextDouble();
            double result = 0.0;
            if ((result = yearNumber % 400) == 0.0) {
                isLeapYear = true;
            } else if ((result = yearNumber % 100) == 0.0) {
                isLeapYear = false;
            } else if ((result = yearNumber % 4) == 0.0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
            if (isLeapYear) {
                System.out.println(yearNumber + " - 366 для високосного года.");
            } else {
                System.out.println(yearNumber + " - 365 для обычного года.");
            }
        }
    }
}

