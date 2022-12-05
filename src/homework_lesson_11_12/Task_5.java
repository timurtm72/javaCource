package homework_lesson_11_12;

import java.util.HashMap;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {
        Map<String, Object> obj = new HashMap<>();
        obj.put("Sim", 5);
        obj.put("Tom", 5.5);
        obj.put("Arbus", false);
        obj.put("Baby", null);
        obj.put("Cat", "Cat");
        obj.put("Eat", new Long(56));
        obj.put("Food", new Character('3'));
        obj.put("Gevey", '6');
        obj.put("Hugs", 111111111111L);
        obj.put("Comp", (double) 123);
        //напишите тут ваш код
        System.out.println("------------------------------------");
        int count = 0;
        for (Map.Entry<String, Object> entry : obj.entrySet()) {
            System.out.println(count + ". " + entry.getKey() + " - " + entry.getValue());
            count++;
        }
        System.out.println("------------------------------------");
    }
}
