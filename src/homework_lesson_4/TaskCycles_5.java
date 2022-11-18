package homework_lesson_4;

public class TaskCycles_5 {
    private static final int AR_NUM = 10;
    public static void main(String[] args) {
        for (int i = 1; i <= AR_NUM; i++) {
            for (int j = 1; j <= AR_NUM; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
