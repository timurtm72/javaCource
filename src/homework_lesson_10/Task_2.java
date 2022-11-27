package homework_lesson_10;

import java.util.ArrayList;
import java.util.SortedMap;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("мама");
        nameList.add("мыла");
        nameList.add("раму");
        int arrSize = nameList.size();

        for (int i = 0; i < arrSize; i++) {
            nameList.add(2 * i + 1, "именно");
        }
        printStringList(nameList);
    }
    public static void printStringList(ArrayList<String> strings){
        int count = 0;
        System.out.println();
        for (String strVal : strings) {
            System.out.println("Строка " + count++ + " " + "\'" +  strVal +  "\'" + " размером " + strVal.length());
        }
        System.out.println();
    }
}
