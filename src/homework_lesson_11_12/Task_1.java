package homework_lesson_11_12;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        Map<String,String> peoples = new HashMap<>();
        peoples.put("Иванов","Сергей");
        peoples.put("Петров","Николай");
        peoples.put("Лаврентьева","Вера");
        peoples.put("Скворцов","Константин");
        peoples.put("Тихонова","Оксана");
        peoples.put("Петров","Алексей");
        peoples.put("Краснов","Сергей");
        peoples.put("Николаева","Алена");
        peoples.put("Говендяева","Елена");
        peoples.put("Талапова","Томара");
        System.out.println("------------------------------------");
        int count = 0;
        for(Map.Entry<String,String> entry : peoples.entrySet()){
            System.out.println(count + ". " + entry.getKey() + " - " + entry.getValue());
            count++;
        }
        System.out.println("------------------------------------");
    }
}
