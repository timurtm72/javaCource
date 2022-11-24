package homework_lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку " + (i + 1));
            String str = scanner.nextLine();
            strList.add(str);
            numberList.add(str.length());
        }

        System.out.print("strList => " + strList);
        System.out.println();
        System.out.print("numberList => " + numberList);
        System.out.println();

        int minInd = getMaxAndMin(numberList)[3];
        int maxInd = getMaxAndMin(numberList)[2];

        int firstValue = 0;

        if(minInd < maxInd){
            firstValue = minInd;
        }else if(minInd > maxInd){
            firstValue = maxInd;
        }

        System.out.println("Короткая строка " + strList.get(minInd)  + " ее индекс " + minInd);
        System.out.println("Длинная строка " + strList.get(maxInd)  + " ее индекс " + maxInd);

        int count = 0;
        String seachStr = strList.get(firstValue);
        System.out.println("Самая первая строка " + (firstValue == minInd?" короткая ":" длинная ") + "\'" + seachStr +"\'" +  " ее индекс " + firstValue);
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
