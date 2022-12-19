package homework_lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> intValues = new ArrayList<>();
        List<String> strValues = new ArrayList<>();

        while (true) {
            System.out.println("Введите строку...");
            String strValue = null;
            try {
                strValue = reader.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if (strValue.isEmpty()) {
                break;
            } else {
                if(strValue != null) strValues.add(strValue);
            }
            System.out.println("Введите число...");
            Integer intValue = 0;
            try {
                intValue = Integer.valueOf(reader.readLine().trim());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if(intValue != null) intValues.add(intValue);
            System.out.println();
        }
        strValues = strValues.stream().sorted(Comparator.naturalOrder()).toList();
        intValues = intValues.stream().sorted(Comparator.reverseOrder()).toList();
        for (int i = 0; i < intValues.size(); i++) {
            System.out.println(strValues.get(i));
            System.out.println(intValues.get(i));
        }
    }
}
