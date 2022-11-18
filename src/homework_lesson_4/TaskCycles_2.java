package homework_lesson_4;

public class TaskCycles_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("8");
            }
            System.out.println();
            count++;
        }
    }
}
