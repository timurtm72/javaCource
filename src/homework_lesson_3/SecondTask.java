package homework_lesson_3;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        double allResult = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число минут в формате xx,x = ");
            double t = scanner.nextDouble();
            System.out.println("Введенное число = " + t);
            if (t >= 5) {
                allResult = t - (double) (5 * (int) (t / 5.0));
            } else {
                allResult = t;
            }
            if (allResult >= 0 && allResult < 3) {
                System.out.println("Зеленый");
            } else if (allResult >= 3 && allResult < 4) {
                System.out.println("Желтый");
            } else if (allResult >= 4 && allResult < 5) {
                System.out.println("Красный");
            }
        }
    }
}
