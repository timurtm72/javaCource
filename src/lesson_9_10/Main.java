package lesson_9_10;

import lesson_8.models.CardImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int [] array = new int[7];
//        int a  = 0;
//        Integer b = 10;
//        // 1. Создание коллекции и добавление в нее эле ментов.
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(22);
//        list.add(33);
//        list.add(44);
//        System.out.println(list);
//        //2. Метод add() - с указанием индекса
//        list.add(2,88);
//        System.out.println(list);
//        //3. метод set() - затирает значение по поределенному индексу
//        list.set(3,99);
//        System.out.println(list);
//        //4. метод size() - возвращает размер коллекции
//        int collSize = list.size();
//        System.out.println("Размер коллекции = " + collSize);
//        //5. get() - брать объекты нашей коллекции
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " , ");
//        }
//        System.out.println();
//        for (Integer c: list) {
//            System.out.print(c + " , ");
//        }
//        //6. toArray() - преобразование коллекции в массив
//        System.out.println();
//        Object [] objects = list.toArray();
//        for (Object o : objects) {
//            System.out.print(o + " , ");
//        }
//        //7. метод contains()- содержит ли коллекция определенный элемент
//        System.out.println();
//        System.out.println("В коллекции содержится число 101 " + list.contains(101));
//        System.out.println("В коллекции содержится число 88 " + list.contains(88));
//        //8. addAll() - добавить все элементы в новую коллекцию из старой
//        System.out.println();
//        ArrayList<Integer> copyList = new ArrayList<>();
//        copyList.addAll(list);
//        System.out.println(copyList);
//        //9. remove() - удаляет элементы коллекци по определенному индексу
//        System.out.println();
//        System.out.println("До вызова метода remove() по индексу 0");
//        System.out.print(list);
//        list.remove(0);
//        System.out.println();
//        System.out.println("После вызова метода remove() по индексу 0");
//        System.out.print(list);
//        //10. метод, возвращает индекс определенного объекта в коллекции
//        System.out.println();
//        System.out.println("Индекс элемента 88 равен " + list.indexOf(88));
//        System.out.println();
//        //11. sort() - сортировка
//        System.out.println();
////        List<Integer> list1 = new ArrayList<>();
////        list1.add(88;
////        list1.add(99);
////        list1.add(77);
////        list1.add(66);
////        list1.add(55);
//        //12. isEmpty() - проверка пустой лист или нет
//        System.out.println();
//        System.out.println("Пустой list или нет " + list.isEmpty());
//        System.out.println();
//        //13. clear() - удаление всех элементов коллекции
//        System.out.println();
//        System.out.print(list);
//        list.clear();
//        System.out.println();
//        System.out.print(list);
//
//        ArrayList<CardImpl> cardsList = new ArrayList<>();
//        CardImpl card1 = new CardImpl("test",1);
//        CardImpl card2 = new CardImpl("test",1);
//        CardImpl card3 = new CardImpl("test",1);
//        CardImpl card4 = new CardImpl("test",1);
//        CardImpl card5 = new CardImpl("test",1);
//
//        cardsList.add(card1);
//        cardsList.add(card2);
//        cardsList.add(card3);
//        cardsList.add(card4);
//        cardsList.add(card5);
//        System.out.println(cardsList);
//
//        HashSet<String> strings = new HashSet<>();
//        strings.add("AAAA");
//        strings.add("BBBB");
//        strings.add("CCCC");
//        strings.add("CCCC");
//        strings.add("DDDD");
//        strings.add(null);
//        System.out.println(strings);

//        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
//        strings1.add("AAAA");
//        strings1.add("BBBB");
//        strings1.add("CCCC");
//        strings1.add("CCCC");
//        strings1.add("DDDD");
//        strings1.add(null);
//        //System.out.println(strings);
//        for(Iterator<String> iter = strings1.iterator();iter.hasNext();){
//            System.out.println(iter.next());
//        }

        TreeSet<Integer> treeSet = new TreeSet<>(new ReverseIntegers());
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(17);
        treeSet.add(22);
        System.out.println(treeSet);

        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("AAA");
        treeSet1.add("aaa");
        treeSet1.add("BBB");
        treeSet1.add("CCC");
        treeSet1.add("DDD");
        treeSet1.add("CCC");
        System.out.println(treeSet1);
    }
}
