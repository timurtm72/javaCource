package homework_lesson_4;

import java.util.Scanner;

public class TaskArray_7 {
    private static final int AR_NUM = 20;

    public static void main(String[] args) {
        int[] array = new int[AR_NUM];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < AR_NUM) {
            System.out.print("Введите " + (count + 1) + " число  = ");
            array[count] = scanner.nextInt();
            count++;
        }
        System.out.println();
        bubbleSorter(array,false);
        for (int i = 0; i < AR_NUM; i++) {
            System.out.println((i + 1) + " ячейка = " + array[i]);
        }
    }

    private static void toSwap(int[] buf1, int first, int second) {  //метод меняет местами пару чисел массива
        int dummy = buf1[first];                            //во временную переменную помещаем первый элемент
        buf1[first] = buf1[second];                         //на место первого ставим второй элемент
        buf1[second] = dummy;                               //вместо второго элемента пишем первый из временной памяти
    }

    public static void bubbleSorter(int[] buf, boolean sortOrder) {//МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = buf.length - 1; out >= 1; out--) {    //Внешний цикл
            for (int in = 0; in < out; in++) {               //Внутренний цикл
                if (sortOrder) {
                    if (buf[in] > buf[in + 1]) {             //Если порядок элементов нарушен
                        toSwap(buf, in, in + 1);      //вызвать метод, меняющий местами
                    }
                } else {
                    if (buf[in] < buf[in + 1]) {             //Если порядок элементов нарушен
                        toSwap(buf, in, in + 1);      //вызвать метод, меняющий местами
                    }
                }
            }
        }
    }
}
