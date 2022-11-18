package homework_lesson_3;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите сторону треугольника a = ");
            double a = scanner.nextDouble();

            System.out.print("Введите сторону треугольника b = ");
            double b = scanner.nextDouble();

            System.out.print("Введите сторону треугольника c = ");
            double c = scanner.nextDouble();

            System.out.print("a = " + a);
            System.out.print(" b = " + b);
            System.out.println(" c = " + c);

            if (((a + b) <= c) || ((b + c) <= a) || ((a + c) <= b)) {
                System.out.println("Треугольник не существует");
            } else {
                System.out.println("Треугольник существует");
            }
        }
    }
}
