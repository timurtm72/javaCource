package homework_lesson_7.task_2;

public class Basket {
    private Product [] purchasedProducts = new Product[100];

    public Basket() {
    }

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
