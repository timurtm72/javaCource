package lesson_5;

import homework_lesson_5.Contact;
import homework_lesson_5.PhoneBook;

public class Methods {
    /**
     Методы-
     Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы. Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;
     Формула создания метода-
     1- модификатор доступа - это одно из 4-х видов слов, указывается перед методом или классом: public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);
     protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте; - будет доступен только внутри текущего пакета (текущей папки);
     private - только внутри текущего класса (файла);
     -Статичность - два варианта: может быть указан признак статичности, либо нет:
     - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
     -Возвращаемый тип или слово void если метод ни чего не возвращает:
     public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
     public static String - если возвращает строку;
     public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;
     4 - Название метода: поясняющее его суть, с моленькай буквы;
     5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
     6 - тело метода (то что должно происходить, когда метод вызовут);
     public static void         printMassiveToConsole(int[][] mass)
     Модификаторы доступа метода      Сигнатура метода

     * */
    public static void main(String[] args) {
        Contact irina  = new Contact("Ирина","+79273456790","ir@gmail.com");
        Contact vasia  = new Contact("Вася","+79245456790","vasia@gmail.com");
        Contact elena  = new Contact("Елена","+79273456780","el@mail.com");
        Contact kostia  = new Contact("Константин","+79272356790","kst@yandex.com");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(irina);
        phoneBook.addContact(vasia);
        phoneBook.addContact(elena);
        phoneBook.addContact(kostia);

        System.out.println(phoneBook);

        phoneBook.renameContact("Елена","Екатерина");

        System.out.println(phoneBook);


        phoneBook.seachContact(new Contact("Константин","+79272356790","kst@yandex.com"));
        phoneBook.seachContact(new Contact("Елена","+79273456780","el@mail.com"));
        phoneBook.seachContact(new Contact("Елена","+79345678900","el1@mail.com"));

        phoneBook.deleteContact(new Contact("Константин","+79272356790","kst@yandex.com"));

        System.out.println(phoneBook);






    }
}
