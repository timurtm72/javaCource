package homework_lesson_4;

import java.util.Scanner;

public class TaskArray_5 {
    private static final int AR_NUM = 20;

    public static void main(String[] args) {
        int[] array = new int[AR_NUM];
        int[] array1 = new int[AR_NUM / 2];
        int[] array2 = new int[AR_NUM / 2];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < AR_NUM) {
            System.out.print("Введите " + (count + 1) + " число  = ");
            array[count] = scanner.nextInt();
            if(count < AR_NUM / 2){
                array1[count] = array[count];
            }
            if(count >= AR_NUM / 2){
                array2[count - AR_NUM / 2] = array[count];
            }
            count++;
        }
        System.out.println();
        for (int i = 0 ; i < AR_NUM / 2; i++) {
            System.out.println((i + 1) + " ячейка = " + array2[i] );
        }
    }
}
