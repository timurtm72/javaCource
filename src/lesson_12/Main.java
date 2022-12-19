package lesson_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Создать коллекцию HashMap турнирная таблица");
        HashMap<String,Integer> table = new HashMap<>();
        System.out.println("------------------------------------");
        table.put("Dinamo",5);
        table.put("Shahter",3);
        table.put("Spartak",6);
        table.put("Zenit",4);
        System.out.println("2.При повторе ключа значение перезаписывается.");
        table.put("Spartak",4);
        System.out.println(table);
        System.out.println("------------------------------------");
        System.out.println("3.containsKey() - содержит ли такой ключ в мапе.");
        System.out.println("------------------------------------");
        System.out.println(table.containsKey("Dinamo"));
        System.out.println(table.containsKey("Rubin"));
        System.out.println("------------------------------------");
        ArrayList<String> string = new ArrayList<>();
        string.add("aaa");
        string.add("bbb");
        string.add("ccc");
        for(String s : string){
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        System.out.println("4. Проход по коллекции");
        for(Map.Entry<String,Integer> entry : table.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------------------------");
        System.out.println("5.Вернуть ключи нашей мапы");
        for(String key : table.keySet()){
            System.out.println("key " + key);
        }
        System.out.println("------------------------------------");
        System.out.println("6.Вернуть значение нашей мапы");
        for(String key : table.keySet()){
            System.out.println("value = " + table.get(key));
        }
        System.out.println("------------------------------------");



        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");



    }
}
