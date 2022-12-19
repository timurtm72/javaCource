package lesson_10_11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Exception и как он работает");
        int a = 10;
        int b = 0;
//        System.out.println(a / b);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(0);
//        System.out.println("2. Exception - null - как он работает");
//        String text = null;
//        System.out.println(text.length());
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.out.println(nullPointerException.getMessage());
//        System.exit(0);

//        System.out.println("3. Обход Exception с помощью if/else");
//        String password = null;
//        if(password != null) {
//            System.out.println(password.length());
//        }
//        System.out.println("Программа продолжилась...");
//        System.out.println("Обход Exception с помощью try - catch");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Программа продолжилась...");
        System.out.println("Обход Exception с помощью try - catch - finally");
        try {
            Files.copy(new File("C:/rg.jpg").toPath(),new File("C:/rggg.jpg").toPath());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
            System.out.println("Ошибка произошла потому что такого файла нет...");
        }catch (IOException e){
            System.out.println("Какой то из потоков не зацепил файл");
        }finally {
            // явно вызвать сборщик мусора, очистить кэш, завершить запись в журнале текущего дня логиррования
        }
        System.out.println("Программа продолжилась...");
    }
}
