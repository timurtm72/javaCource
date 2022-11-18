package homework_lesson_5;

import java.util.Scanner;

public class TaskString_5 {
    private static int AR_NUM = 6;

    public static void main(String[] args) {
        boolean isCleared = false;
        String[] arStr = new String[AR_NUM];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите " + AR_NUM + " строк в консоли...\n");
        System.out.println();

        for (int i = 0; i < AR_NUM; i++) {
            System.out.print("Введите " + i + " строку : ");
            arStr[i] = scanner.nextLine();
        }
        System.out.println();

        for (int i = 0; i < AR_NUM - 1 ; i++) {
            for (int j = 0; j < AR_NUM ; j++) {
                if(j == i){
                    if(j >= AR_NUM - 1){
                        j = AR_NUM - 1;
                    }else {
                        j += 1;
                    }
                }
                if(arStr[i] != null && arStr[j] != null) {
                    if (arStr[i].equals(arStr[j])) {
                        arStr[j] = null;
                        isCleared = true;
                    }
                }
                if(j >= AR_NUM - 1 && isCleared){
                    arStr[i] = null;
                    isCleared = false;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < AR_NUM; i++) {
            System.out.println(i + " cтрока массива " + arStr[i]);
        }
    }
}
