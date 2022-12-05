package lesson_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestSpeed {
    public static void main(String[] args) {
        int SIZE = 500000;
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Время заполнения ArrayList = " + (end - start) + " ms");
        System.out.println();

        start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время заполнения LinkedList = " + (end - start) + " ms");
        System.out.println();

        //ArrayList<Integer> arrayList = new ArrayList<>(10);
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время считывания ArrayList = " + (end - start) + " ms");
        System.out.println();

        start = System.currentTimeMillis();
        //LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время считывания LinkedList = " + (end - start) + " ms");
        System.out.println();
        System.out.println("Размер коллекции = " + SIZE + " элементов.");
        System.out.println();





        //       int a = 10;
//        while(a > 0){
//            System.out.println("Обраный отсчет " + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            a--;
//        }
    }
}
