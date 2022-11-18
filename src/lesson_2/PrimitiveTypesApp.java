package lesson_2;

public class PrimitiveTypesApp {
    public static void main(String[] args) {
        // Типы дынных
        byte a = 10;
        byte b = 50;
        int c = a + b;
        short s = 30000;
        int i = 1201202112;
        long l = 12312122121L;
        // Задача 1. Дано 3 стороны треугольника: a =60, b = 45, c =17
        // Найти периметр
        a = 60;
        b = 45;
        c = 17;
        int triangle = a + b + c;
        System.out.println(triangle);
        // Задача 2. Дано: Есть числа 10,3 и метод научного тыка.
        // Сравнить длину float и double после запятой.
        double d = 10;
        double e = 3;
        float f = (float) (d / e);
        double n = (double) (d / e);
        System.out.println(f);
        System.out.println(n);
        // Задача 3. Коля получил в школе много двоек и решил закопать
        // свой дневник на 127 метров в глубину.
        //А потом передумал вернулся и закопал еще на 1 метр глубже
        byte deep = 127;
        byte result = (byte) (deep + 1);
        System.out.println(result);
        char ch = 'A';
        System.out.println(ch);
        // Задача 4. Дано: 10 красных и 5 зеленых яблок.
        // Верно ли утверждение,что красных яблок больше, чем зеленых.
        int redApple = 10;
        int greenApple = 5;
        boolean res = redApple > greenApple;
        System.out.println(res);
        // Операторы
        /**Арифметические операторы
         + Складывает значения по обе стороны от оператора
         - Вычитает правый операнд из левого операнда
         * Умножает значения по обе стороны от оператора
         / Оператор деления делит левый операнд на правый операнд
         % Делит левый операнд на правый операнд и возвращает остаток
         ++ Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         -- Декремент - уменьшает значение операнда на 1 х-- постфиксная, --х префиксная
         */
          int a1 = 10;
          int b1 = 3;
//        int res1 = a1 % b1;// 10 = (9 / 3) + 1
//        a1++;// a1 = a1 + 1;
//        a1--;// a1 = a1 - 1;
          int res1 = a1 / b1;
          System.out.println(res1);
    }
}