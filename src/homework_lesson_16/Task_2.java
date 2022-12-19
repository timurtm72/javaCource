package homework_lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String key = null;
        Integer value = 0;
        while (true) {
            try {
                System.out.println("Введите число...");
                value = Integer.valueOf(reader.readLine().trim());
                System.out.println();
                System.out.println("Введите строку...");
                key = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (key.isEmpty()) {
                break;
            } else {
                if(key != null && value != null) map.put(key, value);
            }
        }
        if (map.isEmpty()) {
            System.out.println("Список пуст...");
        } else {
            map.entrySet().forEach(entry -> {
                System.out.println(entry.getValue() + " " + entry.getKey());
            });

        }
    }
}