package homework_lesson_4;

import java.util.Scanner;

public class TaskCycles_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя : ");
        String name = scanner.nextLine();
        System.out.print("Введите с клавиатуры год рождения : ");
        int dateOfBirtheYear = scanner.nextInt();

        System.out.print("Введите с клавиатуры месяц рождения : ");
        int dateOfBirtheMonth = scanner.nextInt();

        System.out.print("Введите с клавиатуры день рождения : ");
        int dateOfBirtheDay = scanner.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + dateOfBirtheYear + "." + dateOfBirtheMonth + "." + dateOfBirtheDay);
    }
}
