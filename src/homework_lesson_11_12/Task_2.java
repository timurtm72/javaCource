package homework_lesson_11_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Map<String,Integer> months = new HashMap<>();
        months.put("January", 1);
        months.put("February",2);
        months.put("March",3);
        months.put("April",4);
        months.put("May",5);
        months.put("June",6);
        months.put("July",7);
        months.put("August",8);
        months.put("September",9);
        months.put("October",10);
        months.put("November",11);
        months.put("December",12);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try {
                System.out.println("------------------------------------");
                System.out.println("Enter the name of the month...");
                String nameOfMonth = reader.readLine();
                if(nameOfMonth.isEmpty()) {
                    break;
                }
                if(months.containsKey(nameOfMonth)) {
                    System.out.println( nameOfMonth + " is the " + months.get(nameOfMonth) + " month");
                }else{
                    System.out.println( nameOfMonth + " there is no such name of the month in the list...");
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода " + e.getMessage());
            }
        }
    }
}
