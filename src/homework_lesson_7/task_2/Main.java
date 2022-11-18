package homework_lesson_7.task_2;

public class Main {
    public static void main(String[] args) {
        Category category = new Category();
        Category category1 = new Category("HomeProducts", new Product[100]);

        Basket basket = new Basket(new Product[100]);
        User user = new User();
        User user1 = new User("userLogin", "userPassword", basket);
    }
}
