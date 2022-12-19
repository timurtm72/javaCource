package homework_lesson_11_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> mapOfCityAndLastName = new HashMap<>();
        while (true) {
            String city = null;
            try {
                System.out.println("Введите название города...");
                city = reader.readLine();
                if (city.isEmpty()) {
                    break;
                }
                System.out.println("Введите фамилию...");
                String family = reader.readLine();
                mapOfCityAndLastName.put(city, family);
            } catch (IOException e) {
                System.out.println("Ошибка ввода " + e.getMessage());
            }

        }
        System.out.println("------------------------------------");
        int count = 0;
        for(Map.Entry<String,String> entry : mapOfCityAndLastName.entrySet()){
            System.out.println(count + ". Город: " + entry.getKey() + ", Фамилия: " + entry.getValue());
            count++;
        }
        System.out.println("------------------------------------");
        while(true) {
            String city = null;
            try {
                System.out.println("Введите для поиска название города...");
                city = reader.readLine();
                if(city.isEmpty()){
                    break;
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода " + e.getMessage());
            }
            if (mapOfCityAndLastName.containsKey(city)) {
                String familyName = mapOfCityAndLastName.get(city);
                System.out.println("Найдена фамилия " + familyName + " проживает в городе " + city);
            } else {
                System.out.println("К сожалению фамилия не найдена...");
            }
            System.out.println();
        }
    }
}
