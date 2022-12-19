package homework_lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_3 {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 30; i++) {
            System.out.println("Введите " + (i + 1) + " число...");
            Integer value = null;
            try {
                value = Integer.valueOf(reader.readLine());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if(value != null) values.add(value);
        }
        Collections.sort(values,(a1, a2)->a1.compareTo(a2));
        System.out.println(values);
        System.out.println("Десятое минимальное - " + values.get(9));
        System.out.println("Одиннадцатое минимальное - " + values.get(10));
    }
}
