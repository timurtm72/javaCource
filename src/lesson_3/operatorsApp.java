package lesson_3;

public class operatorsApp {
    public static void main(String[] args) {
        /** Операторы сравнения
         == Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным (A == B) – не верны

         != Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным (A != B) – значение истинна

         > Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным (A > B) – не верны

         < Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным (A < B) – значение истинна

         >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным (A >= B) – значение не верны

         <= Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным (A <= B) – значение истинна
         * */
//        int a = 5;
//        int b = 3;
//        boolean c = a != 5;
//        System.out.println(c);

        /**
         Логические операторы
         && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         * */
        int a = 1;
        int x = a++;
        int y = ++x;
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);

    }
}