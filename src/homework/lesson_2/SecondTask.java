package homework.lesson_2;

public class SecondTask {
    public static void main(String[] args) {
        // Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
        // Вывести на консоль
        // У квдрата все стороны равны,а в условии размеры сторон разные,значит это прямоугольник
        int a = 50;// размер 1 стороны квадрата
        int b = 20;// размер 2 стороны квадрата
        int s =  0;// Площадь квадрата

        s = a * b;
        System.out.println("Размер 1 стороны квадрата = " + a);
        System.out.println("Размер 2 стороны квадрата = " + b);
        System.out.println("Площадь квадрата = " + s);
    }
}
