package lesson_4;

public class arrayApp {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[100];
        array3[0] = 11;
        array3[1] = 22;
        array3[2] = 33;
        array3[3] = 44;
        array3[4] = 55;
//        for (int item:array3) {
//            System.out.println(item);
//        }
//        for (int i = 0; i < 5; i++) {
//            array3[i] = i + 1;
//            System.out.println(array3[i]);
//        }

//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        for (int i = 10; i <= 30 ; i++) {
            if (array3[i] % 2 != 0){
                System.out.println(array3[i] + ' ');
            }
        }

    }
}
