package lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[7];
        int a  = 0;
        Integer b = 10;
        // 1. Создание коллекции и добавление в нее эле ментов.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        System.out.println(list);
        //2. Метод add() - с указанием индекса
        list.add(2,88);
        System.out.println(list);
        //3. метод set() - затирает значение по поределенному индексу
        list.set(3,99);
        System.out.println(list);
        //4. метод size() - возвращает размер коллекции
        int collSize = list.size();
        System.out.println("Размер коллекции = " + collSize);
        //5. get() - брать объекты нашей коллекции
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " , ");
        }
        System.out.println();
        for (Integer c: list) {
            System.out.print(c + " , ");
        }
        //6. toArray() - преобразование коллекции в массив
        System.out.println();
        Object [] objects = list.toArray();
        for (Object o : objects) {
            System.out.print(o + " , ");
        }
        //7. метод contains()- содержит ли коллекция определенный элемент
        System.out.println();
        System.out.println("В коллекции содержится число 101 " + list.contains(101));
        System.out.println("В коллекции содержится число 88 " + list.contains(88));
        //8. addAll() - добавить все элементы в новую коллекцию из старой
        System.out.println();
        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);
        System.out.println(copyList);
        //9. remove() - удаляет элементы коллекци по определенному индексу
        System.out.println();
        System.out.println("До вызова метода remove() по индексу 0");
        System.out.print(list);
        list.remove(0);
        System.out.println();
        System.out.println("После вызова метода remove() по индексу 0");
        System.out.print(list);
        //10. метод, возвращает индекс определенного объекта в коллекции
        System.out.println();
        System.out.println("Индекс элемента 88 равен " + list.indexOf(88));
        System.out.println();
        //11. sort() - сортировка
        System.out.println();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(88;
//        list1.add(99);
//        list1.add(77);
//        list1.add(66);
//        list1.add(55);
        //12. isEmpty() - проверка пустой лист или нет
        System.out.println();
        System.out.println("Пустой list или нет " + list.isEmpty());
        System.out.println();
        //13. clear() - удаление всех элементов коллекции
        System.out.println();
        System.out.print(list);
        list.clear();
        System.out.println();
        System.out.print(list);
    }
}
