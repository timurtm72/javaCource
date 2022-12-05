package homework_lesson_11_12;

import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void main(String[] args) {
        Map<String, String> plants = new HashMap<>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("женьшень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");
        System.out.println("------------------------------------");
        int count = 0;
        for (Map.Entry<String, String> entry : plants.entrySet()) {
            System.out.println(count + ". " + entry.getKey() + " - " + entry.getValue());
            count++;
        }
        System.out.println("------------------------------------");
    }
}