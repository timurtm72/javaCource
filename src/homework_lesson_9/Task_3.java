package homework_lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> minNumberList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку " + (i + 1));
            String str = scanner.nextLine();
            strList.add(str);
            numberList.add(str.length());
        }

        System.out.println("strList " + strList);
        System.out.println("numberList " + numberList);
        int count = 0;
        int minInt = getMaxAndMin(numberList)[1];
        int minInd = getMaxAndMin(numberList)[3];
        for (Integer data : numberList) {
            if(data == minInt){
                minNumberList.add(count);
            }
            count++;
        }
        System.out.print("minNumberList " + minNumberList);
        System.out.println();
        for (Integer maxIndStr : minNumberList) {
            System.out.println("Самая короткая строка " + "\'" + strList.get(maxIndStr) + "\'"  + " индекс " + maxIndStr + " ее размер " + strList.get(maxIndStr).length());
        }
        System.out.println();
    }
    public static int[] getMaxAndMin(ArrayList<Integer> items) {
        int max = items.get(0);
        int min = items.get(0);
        int indMax = 0, indMin = 0;
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) > max) {
                max = items.get(i);
                indMax = i;
            } else if (items.get(i) < min) {
                min = items.get(i);
                indMin = i;
            }
        }
        return new int[]{max, min,indMax,indMin};
    }
}
